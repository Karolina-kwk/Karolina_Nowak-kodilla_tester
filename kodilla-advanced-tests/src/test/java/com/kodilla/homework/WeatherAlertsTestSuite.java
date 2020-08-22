package com.kodilla.homework;

import com.kodilla.mockito.Client;
import com.kodilla.mockito.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherAlertsTestSuite {

    WeatherAlerts weatherAlerts = new WeatherAlerts();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @BeforeEach
    public void addLocationsAndClients() {
        weatherAlerts.addLocation("Płock");
        weatherAlerts.addLocation("Gdańsk");
        weatherAlerts.addClient("Płock", client);
        weatherAlerts.addClient("Płock", secondClient);
        weatherAlerts.addClient("Gdańsk", thirdClient);
    }

    @Test
    public void shouldAddClientToLocation() {
        boolean testResult = weatherAlerts.addClient("Płock", thirdClient);
        assertTrue(testResult);
    }

    @Test
    public void shouldRemoveClientFromLocation() {
        boolean testResult = weatherAlerts.removeClient("Gdańsk", thirdClient);
        assertTrue(testResult);
    }

    @Test
    public void shouldRemoveClientFromAllLocations() {
        weatherAlerts.addClient("Płock", thirdClient);
        weatherAlerts.removeClient("Płock", thirdClient);
        Map<String, Set<Client>> locations = weatherAlerts.getLocations();
        assertEquals(2, locations.get("Płock").size());
        assertEquals(1, locations.get("Gdańsk").size());
    }

    @Test
    public void shouldNotifyClientsForLocation() {
        weatherAlerts.notifyClient("Gdańsk", notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldNotifyAllClients() {
        weatherAlerts.noifyClients(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        weatherAlerts.removeLocation("Gdańsk");
        Map<String, Set<Client>> locations = weatherAlerts.getLocations();
        assertEquals(2, locations.get("Płock").size());
    }
}