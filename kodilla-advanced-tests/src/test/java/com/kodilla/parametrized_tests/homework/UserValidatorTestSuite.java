package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"abc", "dystrict13", "nk.kn94", "mar-ro-kO", "s_p_a-2020"})
    public void shouldReturnTrueForCorrectUserName(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"rafi@876.com", "j.puszcz85@interia.pl", "la_poste@frafra.fr"})
    public void shouldReturnTrueForCorrectEmail(String email) {
        assertTrue(userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"ma", "5d", "dra!@#$%^", "brzęczyszczykiewicz", "żółć", " "})
    public void shouldReturnFalseForIncorrectUserName(String userName) {
        assertFalse(userValidator.validateUsername(userName));
    }
    @ParameterizedTest
    @ValueSource(strings = {"lesamis", "@bro.pro", "john@smith", "żół@łów.pl", " "})
    public void shouldReturnFalseForIncorrectEmail(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}