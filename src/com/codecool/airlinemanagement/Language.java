package com.codecool.airlinemanagement;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Language {
    ENGLISH, GERMAN, SPANISH, RUSSIAN;

    /**
     * enum Language
     * has static final values of:
     * List VALUES -- containing all enums
     * int SIZE -- number of enums
     * Random Random;
     */
    private static final List<Language> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();


    /**
     * randomLanguage
     * @return random language-enumr
     */
    public static Language randomLanguage() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
