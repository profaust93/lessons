package com.javaguru.lesson4;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= array[i].length - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fill2ndArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101);
            }
        }
        return array;
    }

    public static void printValidStrings(String[] strings) {
        for (String str : strings) {
            if (isValidUserString(str, 5)) {
                System.out.println(str);
            }
        }
    }

    public static boolean isValidUserString(String userString, int validLength) {
        if (userString == null) {
            return false;
        }
        return userString.length() < validLength;
    }

    public static void printStringArray(String[] strings) {
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }

    public static String[] fillStringArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = getStringFromUser();
        }
        return strings;
    }

    public static String getStringFromUser() {
        System.out.println("Enter any string: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String[] createStringArray(int length) {
        String[] strings = new String[length];
        return strings;
    }

    public static void printArray(int[] array) {
        for (int a : array) {
            System.out.println(a);
        }
    }

    protected static int[] fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    public static int getNumberFromUser() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }
}
