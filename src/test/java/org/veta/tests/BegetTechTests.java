package org.veta.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.StartPage;

import static io.qameta.allure.Allure.step;
import static org.veta.tests.TestData.email;
import static org.veta.tests.TestData.password;

public class BegetTechTests extends TestBase {

    StartPage start = new StartPage();

    @Test
    @Owner("Veta Iuzykhovich")
    @DisplayName("Successfull login")
    void checkSuccessfullLoginTest() {
        step("Open page", () -> {
            start.openPage();
        });
        step("Filling user e-mail", () -> {
            start.setEmail(email);

        });
        step("Filling user password", () -> {
            start.setPassword(password);

        });
        step("Checking login successfull", () -> {
            start.checkLoginSuccessfull();
        });
    }
}
