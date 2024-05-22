package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 150; i++) {
            System.out.println(generate());
        }

    }

    public static String generate() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        appendSegment(stringBuilder, random, (random.nextInt(2) + 1) * 8);
        stringBuilder.append(".");
        appendSegment(stringBuilder, random, (random.nextInt(3) + 1) * 8);
        stringBuilder.append(".");
        appendSegment(stringBuilder, random, (random.nextInt(4) + 1) * 8);
        stringBuilder.append(".");
        appendSegment(stringBuilder, random, (random.nextInt(3) + 1) * 8);
        stringBuilder.append(".");
        appendSegment(stringBuilder, random, (random.nextInt(2) + 1) * 8);

        return stringBuilder.toString();
    }

    private static final String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!'^+%&/()=>£#$½{[]}?*_-,";

    private static void appendSegment(StringBuilder stringBuilder, Random random, int length) {
        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            stringBuilder.append(randomChar);
        }
    }

}