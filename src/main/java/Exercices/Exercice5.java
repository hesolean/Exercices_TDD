package Exercices;

public class Exercice5 {
    public boolean anneesBissextiles(int annee) {
        boolean resultat = false;

        if (annee%4 == 0 && !(annee%100 == 0) && annee%400 == 0) {
            resultat = true;
        }
        return resultat;
    }
}
