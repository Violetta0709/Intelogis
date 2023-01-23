package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartPage {

    private SelenideElement

            email = $("[name=auth_email]"),
            password = $("[name=auth_pass]");

    public StartPage openPage() {
        open(baseUrl);
        return this;
    }

    public StartPage setEmail(String value) {
        email.setValue(value);
        return this;
    }

    public StartPage setPassword(String value) {
        password.setValue(value);
        $("[name=form_auth_submit]").click();
        return this;
    }

    public StartPage checkLoginSuccessfull() {
        $(".form_auth_style").shouldHave(text("Сколько Вам лет?"));
        return this;
    }
}


