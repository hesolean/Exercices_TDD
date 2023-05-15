package Exercices;

public class Exercice3 {
    //inverser le mot
    private String mot = "anticonstitutionnellement";

    public String inverserMot (String mot) {
        String motInverse = "";
        for (int i = 0; i < mot.length(); i++) {
            motInverse += mot.charAt(mot.length()-1-i);
        }
        return motInverse;
    }
}
