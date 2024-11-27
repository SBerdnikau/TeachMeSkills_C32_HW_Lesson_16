package com.teachmeskills.lesson_16.task1.service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PassportGenerator {
    public static Set<String> generatePassportNumbers() {
        Set<String> passports = new HashSet<>();
        Random rand = new Random();

        // Array of possible passport prefixes
        String[] passportPrefix = {"MP", "KN", "AB", "CD", "EF", "GH"};

        while (passports.size() < 16) {
            // Randomly select a prefix from the array
            String prefix = passportPrefix[rand.nextInt(passportPrefix.length)];
            StringBuilder sb = new StringBuilder(prefix);

            for (int i = 0; i < 7; i++) {
                sb.append(rand.nextInt(10));
            }
            passports.add(sb.toString());
        }
        return passports;
    }
}
