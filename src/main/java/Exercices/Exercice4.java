package Exercices;

public class Exercice4 {
    public String transformationIntegerEnFizzBuzz(int i) {
        String resultat = "";
        if (i%15 == 0) {
            resultat = "FizzBuzz";
        } else if (i%5 == 0) {
            resultat = "Buzz";
        } else if (i%3 == 0) {
            resultat = "Fizz";
        } else {
            resultat = i+"";
        }
        return resultat;
    }

    public String retourGlobal() {
        String retour = "";
        for (int i = 1; i <= 100; i++) {
            retour += transformationIntegerEnFizzBuzz(i);
        }
        return retour;
    }
}
