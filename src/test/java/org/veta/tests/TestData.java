package org.veta.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    private static final Faker faker = new Faker(new Locale("en"));
    public static String
            email = faker.internet().emailAddress(),
            password = faker.internet().password(5,7);
}
