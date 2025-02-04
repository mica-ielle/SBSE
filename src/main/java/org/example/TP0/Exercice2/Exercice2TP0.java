package org.example.TP0.Exercice2;

import java.util.*;

public class Exercice2TP0 {

    public static List<String> bfs(Map<String, List<String>> graphe, String noeudDepart) {
        List<String> visites = new ArrayList<>();
        Queue<String> fileAttente = new LinkedList<>();
        Set<String> visitesEnCours = new HashSet<>();

        fileAttente.add(noeudDepart);
        visitesEnCours.add(noeudDepart);

        while (!fileAttente.isEmpty()) {
            String noeudActuel = fileAttente.poll();
            visites.add(noeudActuel);

            List<String> voisins = graphe.getOrDefault(noeudActuel, new ArrayList<>());
            for (String voisin : voisins) {
                if (!visitesEnCours.contains(voisin)) {
                    fileAttente.add(voisin);
                    visitesEnCours.add(voisin);
                }
            }
        }

        return visites;
    }

    public static void dfsRecursive(Map<String, List<String>> graphe, String noeudActuel, List<String> visites, Set<String> visitesEnCours) {

        visites.add(noeudActuel);
        visitesEnCours.add(noeudActuel);

        List<String> voisins = graphe.getOrDefault(noeudActuel, new ArrayList<>());
        for (String voisin : voisins) {
            if (!visitesEnCours.contains(voisin)) {
                dfsRecursive(graphe, voisin, visites, visitesEnCours);
            }
        }
    }

    public static List<String> dfs(Map<String, List<String>> graphe, String noeudDepart) {

        List<String> visites = new ArrayList<>();
        Set<String> visitesEnCours = new HashSet<>();
        dfsRecursive(graphe, noeudDepart, visites, visitesEnCours);
        return visites;
    }







    public static void Execute() {
        // Exemple de graphe (carte de ville)
        Map<String, List<String>> carteVille = new HashMap<>();
        carteVille.put("A", Arrays.asList("B", "C"));
        carteVille.put("B", Arrays.asList("A", "D", "E"));
        carteVille.put("C", Arrays.asList("A", "F"));
        carteVille.put("D", Arrays.asList("B"));
        carteVille.put("E", Arrays.asList("B", "F"));
        carteVille.put("F", Arrays.asList("C", "E"));


        System.out.println("Pour la carte : " + carteVille.toString());
        System.out.println("");

        // Test BFS
        System.out.println("BFS à partir du nœud 'A': " + bfs(carteVille, "A"));
        System.out.println("");

        // Test DFS récursif
        System.out.println("DFS récursif à partir du nœud 'A': " + dfs(carteVille, "A"));
        System.out.println("");

    }
}
