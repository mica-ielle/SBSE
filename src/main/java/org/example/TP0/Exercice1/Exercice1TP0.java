package org.example.TP0.Exercice1;

import java.util.Arrays;

public class Exercice1TP0 {


    public static int rechercheBinaire(int[] listeTriee, int cible) {

        int gauche = 0;
        int droite = listeTriee.length - 1;

        while (gauche <= droite) {
            int milieu = gauche + (droite - gauche) / 2;

            if (listeTriee[milieu] == cible) {
                return milieu;
            } else if (listeTriee[milieu] < cible) {
                gauche = milieu + 1;
            } else {
                droite = milieu - 1;
            }
        }

        return -1;
    }

//code pour recuperer la liste
//code pour recuperer la cible

    public static void Execute() {
        int[] liste1 = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        String l1 = Arrays.stream(liste1).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        int cible1 = 23;
        int index1 = rechercheBinaire(liste1, cible1);
        System.out.println("Dans le tableau : [ "+l1+" ]");
        System.out.println("La cible " + cible1 + " se trouve à l'index " + index1);
        System.out.println("");

        int cible2 = 42;
        int index2 = rechercheBinaire(liste1, cible2);
        System.out.println("Dans le tableau : [ "+l1+" ]");
        System.out.println("La cible " + cible2 + " se trouve à l'index " + index2);
        System.out.println("");

        int[] liste2 = {10, 20, 30, 40, 50};
        String l2 = Arrays.stream(liste2).mapToObj(String::valueOf).reduce((a,b) -> a+" "+b).orElse("");
        int cible3 = 10;
        int index3 = rechercheBinaire(liste2, cible3);
        System.out.println("Dans le tableau : [ "+l2+" ]");
        System.out.println("La cible " + cible3 + " se trouve à l'index " + index3);
        System.out.println("");

        int cible4 = 50;
        int index4 = rechercheBinaire(liste2, cible4);
        System.out.println("Dans le tableau : [ "+l2+" ]");
        System.out.println("La cible " + cible4 + " se trouve à l'index " + index4);
        System.out.println("");

        int cible5 = 35;
        int index5 = rechercheBinaire(liste2, cible5);
        System.out.println("Dans le tableau : [ "+l2+" ]");
        System.out.println("La cible " + cible5 + " se trouve à l'index " + index5);
        System.out.println("");
    }
}
