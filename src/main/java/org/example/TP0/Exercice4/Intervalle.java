package org.example.TP0.Exercice4;

class Intervalle {
    int debut;
    int fin;

    public Intervalle(int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "[" + debut + ", " + fin + "]";
    }
}
