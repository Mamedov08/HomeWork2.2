package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(funkc(generateRandomAge(), 18));
        System.out.println(funkc(generateRandomAge(), 20));
        System.out.println(funkc(generateRandomAge(), 40));
        System.out.println(funkc(generateRandomAge(), -10));
        System.out.println(funkc(generateRandomAge(), 32));

    }

    public static String funkc(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";

        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }
}