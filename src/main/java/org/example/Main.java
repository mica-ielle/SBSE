package org.example;


import org.example.TP0.Exercice1.Exercice1TP0;
import org.example.TP0.Exercice2.Exercice2TP0;
import org.example.TP0.Exercice3.Exercice3TP0;
import org.example.TP0.Exercice4.Exercice4TP0;
import org.example.TP0.Exercice5.Exercice5TP0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        int iteration = 0;
        int operation = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("____________________________ MENU ____________________________");
            System.out.println("____________________ 1. Recherche Binaire ____________________");
            System.out.println("________________________ 2. BFS & DFS ________________________");
            System.out.println("________________________ 3. Sac à dos ________________________");
            System.out.println("___________________ 4. Fusion d'Intervalles __________________");
            System.out.println("___________________ 5. Algorithme de kadane __________________");
            System.out.println("______________________________________________________________");
            System.out.println("___________ Quelle opération voulez vous effectuer ? _________");
            operation = scanner.nextInt();


            switch (operation){
                case 1:
                    Exercice1TP0.Execute();
                    break;
                case 2:
                    Exercice2TP0.Execute();
                    break;
                case 3:
                    Exercice3TP0.Execute();
                    break;
                case 4:
                    Exercice4TP0.Execute();
                    break;
                case 5:
                    Exercice5TP0.Execute();
                    break;
                default:
                    System.out.println("CE NUMERO NE CORRESPOND A AUCUNE FONCTION BIEN VOULOIR REESSAYER !!!");
                    break;
            }

            System.out.println("___________ Appuyer 1 pour vous arreter _________");
            System.out.println("________ Appuyer 0 pour retourner au menu _______");
            iteration = scanner.nextInt();
        }while (iteration==0);
    }
}