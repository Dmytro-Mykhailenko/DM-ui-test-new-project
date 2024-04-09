package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Generator {

    public static String getRandomAlfabeticalString(int length) {

        boolean useLetters = true;
        boolean useNumbers = false;

        return RandomStringUtils.random(length, useLetters, useNumbers);

    }

    public static String getRandomNumericString(int length) {

        boolean useLetters = false;
        boolean useNumbers = true;

        return RandomStringUtils.random(length, useLetters, useNumbers);

    }

    public static String getRandomMixedString(int length) {

        boolean useLetters = true;
        boolean useNumbers = true;

        return RandomStringUtils.random(length, useLetters, useNumbers);

    }

    public static String getRandomEmail(int length) {

        return getRandomMixedString(length) + "@random.test";

    }
}