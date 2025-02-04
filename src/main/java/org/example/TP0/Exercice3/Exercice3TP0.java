package org.example.TP0.Exercice3;


import java.util.*;

public class Exercice3TP0 {


    public static Resultat sacADos(List<Item> items, int capacity) {

        int n = items.size();
        int[][] dp = new int[n + 1][capacity + 1];

        // Remplir le tableau
        for (int i = 1; i <= n; i++) {
            Item item = items.get(i - 1);
            for (int w = 1; w <= capacity; w++) {
                if (item.poid <= w) {
                    dp[i][w] = Math.max(item.valeur + dp[i - 1][w - item.poid], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Retracer les éléments choisis
        List<Item> selectedItems = new ArrayList<>();
        int w = capacity;
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                selectedItems.add(items.get(i - 1));
                w -= items.get(i - 1).poid;
            }
        }

        return new Resultat(dp[n][capacity], selectedItems);
    }




    public static void Execute() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(10, 60));
        items.add(new Item(20, 100));
        items.add(new Item(30, 120));
        int capacity = 50;

        Resultat result = sacADos(items, capacity);
        System.out.println("Pour une composition :");
        System.out.println("Poids, valeur : "+items.toString());
        System.out.println("Et un poids maximal de : "+capacity);
        System.out.println("");
        System.out.println("Valeur maximale: " + result.valeurMax);
        System.out.println("");
        System.out.println("Éléments choisis:");
        for (Item item : result.itemsSelectionne) {
            System.out.println("Poids: " + item.poid + ", Valeur: " + item.valeur);
        }



        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(1, 10));
        items2.add(new Item(2, 20));
        items2.add(new Item(3, 30));
        items2.add(new Item(4, 40));
        int capacity2 = 5;

        Resultat result2 = sacADos(items2, capacity2);
        System.out.println("Pour une composition :");
        System.out.println("Poids, valeur : "+items2.toString());
        System.out.println("Et un poids maximal de : "+capacity2);
        System.out.println("");
        System.out.println("Valeur maximale: " + result2.valeurMax);
        System.out.println("");
        System.out.println("Éléments choisis:");
        for (Item item : result2.itemsSelectionne) {
            System.out.println("Poids: " + item.poid + ", Valeur: " + item.valeur);
        }

    }
}
