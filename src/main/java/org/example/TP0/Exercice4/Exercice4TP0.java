package org.example.TP0.Exercice4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercice4TP0 {


    public static List<Intervalle> fusionnerIntervalle(List<Intervalle> intervalles) {
        if (intervalles == null || intervalles.isEmpty()) {
            return new ArrayList<>();
        }

        // 1. Tri des intervalles par temps de début
        Collections.sort(intervalles, Comparator.comparingInt(intervalle -> intervalle.debut));


        List<Intervalle> fusionnes = new ArrayList<>();
        Intervalle courant = intervalles.get(0);

        for (int i = 1; i < intervalles.size(); i++) {
            Intervalle prochain = intervalles.get(i);

            // 2. Comparaison et fusion
            if (prochain.debut <= courant.fin) {
                courant.fin = Math.max(courant.fin, prochain.fin);
            } else {
                fusionnes.add(courant);
                courant = prochain;
            }
        }

        fusionnes.add(courant);

        return fusionnes;
    }

    public static void Execute() {
        List<Intervalle> intervalles = new ArrayList<>();
        intervalles.add(new Intervalle(1, 3));
        intervalles.add(new Intervalle(2, 6));
        intervalles.add(new Intervalle(8, 10));
        intervalles.add(new Intervalle(15, 18));
        intervalles.add(new Intervalle(16, 17));


        System.out.println("Intervalle initiaux : " + intervalles);
        List<Intervalle> fusionnes = fusionnerIntervalle(intervalles);
        System.out.println("Intervalles fusionnés : " + fusionnes);

        List<Intervalle> intervalles2 = new ArrayList<>();
        intervalles2.add(new Intervalle(1,4));
        intervalles2.add(new Intervalle(0,2));
        intervalles2.add(new Intervalle(3,5));

        System.out.println("\nIntervalle initiaux : " + intervalles2);
        List<Intervalle> fusionnes2 = fusionnerIntervalle(intervalles2);
        System.out.println("Intervalles fusionnés : " + fusionnes2);

        List<Intervalle> intervalles3 = new ArrayList<>();
        intervalles3.add(new Intervalle(1,5));
        intervalles3.add(new Intervalle(2,3));

        System.out.println("\nIntervalle initiaux : " + intervalles3);
        List<Intervalle> fusionnes3 = fusionnerIntervalle(intervalles3);
        System.out.println("Intervalles fusionnés : " + fusionnes3);
    }
}

