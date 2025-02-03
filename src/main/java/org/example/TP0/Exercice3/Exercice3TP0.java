package org.example.TP0.Exercice3;


import java.util.*;

public class Exercice3TP0 {


    public static int sacADos(int[] poids, int[] valeurs, int poidsMax) {
        int n = poids.length;
        int[][] tableauValeurs = new int[n + 1][poidsMax + 1];

        // Initialisation de la première ligne et colonne à 0
        for (int i = 0; i <= n; i++) {
            tableauValeurs[i][0] = 0;
        }
        for (int w = 0; w <= poidsMax; w++) {
            tableauValeurs[0][w] = 0;
        }

        // Remplissage du tableau
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= poidsMax; w++) {
                if (poids[i - 1] <= w) {
                    tableauValeurs[i][w] = Math.max(
                            valeurs[i - 1] + tableauValeurs[i - 1][w - poids[i - 1]],
                            tableauValeurs[i - 1][w]
                    );
                } else {
                    tableauValeurs[i][w] = tableauValeurs[i - 1][w];
                }
            }
        }

        return tableauValeurs[n][poidsMax];
    }




    public static void Execute() {
        int[] poids = {10, 20, 30};
        String p1 = Arrays.stream(poids).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        int[] valeurs = {60, 100, 120};
        String v1 = Arrays.stream(valeurs).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        int poidsMax = 50;


        System.out.println("Pour une composition :");
        System.out.println("Poids : [ "+p1+" ]");
        System.out.println("Valeurs : [ "+v1+" ]");
        System.out.println("Et un poids maximal de : "+poidsMax);
        System.out.println("");

        int valeurMax = sacADos(poids, valeurs, poidsMax);
        System.out.println("La valeur maximale atteignable est : " + valeurMax);
        System.out.println("");
        System.out.println("");

        int[] poids2 = {1, 2, 3, 4};
        String p2 = Arrays.stream(poids2).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        int[] valeurs2 = {10, 20, 30, 40};
        String v2 = Arrays.stream(valeurs2).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        int poidsMax2 = 5;


        System.out.println("Pour une composition :");
        System.out.println("Poids : [ "+p2+" ]");
        System.out.println("Valeurs : [ "+v2+" ]");
        System.out.println("Et un poids maximal de : "+poidsMax2);
        System.out.println("");


        int valeurMax2 = sacADos(poids2, valeurs2, poidsMax2);
        System.out.println("La valeur maximale atteignable est : " + valeurMax2);
        System.out.println("");
    }
}
