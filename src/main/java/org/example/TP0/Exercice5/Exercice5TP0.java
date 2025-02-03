package org.example.TP0.Exercice5;

import java.util.Arrays;

public class Exercice5TP0 {


    public static int maxSumSubArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être null ou vide.");
        }

        int maxSoFar = array[0];
        int currentMax = array[0];

        for (int i = 1; i < array.length; i++) {
           currentMax = Math.max(array[i], currentMax + array[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void Execute() {
        int[] array1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        String l1 = Arrays.stream(array1).mapToObj(String::valueOf).reduce((a, b) -> a+" "+b).orElse("");
        System.out.println("Pour le tableau : [ " + l1+" ]");
        System.out.println("Somme maximale du sous-tableau est : " + maxSumSubArray(array1));
        System.out.println("");

        int[] array2 = {-1, -2, -3, -4};
        String l2 = Arrays.stream(array2).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        System.out.println("Pour le tableau : [ " + l2+" ]");
        System.out.println("Somme maximale du sous-tableau est : " + maxSumSubArray(array2));
        System.out.println("");

        int[] array3 = {1, 2, 3, 4};
        String l3 = Arrays.stream(array3).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        System.out.println("Pour le tableau : [ " + l3+" ]");
        System.out.println("Somme maximale du sous-tableau est : " + maxSumSubArray(array3));
        System.out.println("");

        int[] array4 = { -2, -3, 4, -1, -2, 1, 5, -3};
        String l4 = Arrays.stream(array4).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        System.out.println("Pour le tableau : [ " + l4+" ]");
        System.out.println("Somme maximale du sous-tableau est : " + maxSumSubArray(array4));
        System.out.println("");

    }

}

