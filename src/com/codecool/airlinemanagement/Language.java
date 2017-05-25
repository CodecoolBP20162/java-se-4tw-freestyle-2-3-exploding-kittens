package com.codecool.airlinemanagement;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Language {
    ENGLISH, GERMAN, SPANISH, RUSSIAN;

    private static final List<Language> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Language randomLanguage() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
