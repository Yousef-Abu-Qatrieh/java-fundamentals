/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        roll(5);
        System.out.println("");
        int[] rr = {5, 4, 3, 5, 1, 6};

        System.out.println(containsDuplicates(rr));
        int[] gg = {1, 2, 3, 4, 5, 6};
        System.out.println(containsDuplicates(gg));

        int[] ss = {1, 5, 7, 8, 9, 6, 10};

        calculateAvg(ss);
        int aa[] = {44, 50, 30, 20, 80, 99, 78};
        calculateAvg(aa);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(arrayArrays(weeklyMonthTemperatures));

    }

    public static int[] roll(int roll) {
        int[] values = new int[roll];
        Random random = new Random();

        for (int index = 0; index < values.length; index++) {
            int flip = (int) (Math.random() * 6 + 1);
            System.out.print(values[index] = flip);
            System.out.print(" ");

        }

        return values;

    }

    public static boolean containsDuplicates(int[] arr) {
        for (int index = 0; index < arr.length; index++) {

            for (int secondIndex = index + 1; secondIndex < arr.length; secondIndex++) {
                if (arr[index] == arr[secondIndex]) {
                    return true;
                }
            }
        }

        return false;

    }

    public static double calculateAvg(int[] arr) {
        double avg = 0;
        for (int index = 0; index < arr.length; index++) {

            avg += arr[index];

        }
        System.out.println(avg /= arr.length);
        return avg;
    }

    public static double arrayArrays(int[][] arr) {
//        ArrayList <Integer> value=new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//
//
//       }
        double u = 0;
        for (int[] arrs : arr) {
            u = Arrays.stream(arrs).average().orElse(Double.NaN);

        }
        return u;

    }
}