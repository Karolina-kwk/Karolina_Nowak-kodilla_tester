package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.findElement(By.xpath("//button[@class='_13q9y _8hkto munh_56_m m7er_k4 m7er_wn m7er_56_m']")).click();

        WebElement categoryCombo = driver.findElement(By.xpath("//select[@class='_d25db_ZZIhH _1h7wt _k70df m7er_k4 m7er_wn']"));
        Select selectCategory = new Select(categoryCombo);
        selectCategory.selectByIndex(3);

        WebElement insertProductData = driver.findElement(By.xpath("//input[@class='_d25db_1734G _14uqc']"));
        insertProductData.sendKeys("Mavic mini");
        insertProductData.submit();
    }
}
