package fr.semifir.calculatrice;

public class Calculatrice {
    /**
     * réaliser une addition sur 2 nombres
     * @param a : terme 1
     * @param b : terme 2
     * @return : résultat de l'opération
     */
    public float additionner (float a, float b) {
        return a + b;
    }
    /**
     * réaliser une soustraction sur 2 nombres
     * @param a : terme 1
     * @param b : terme 2
     * @return : résultat de l'opération
     */
    public float soustraire (float a, float b) {
        return a - b;
    }
    /**
     * réaliser multiplication sur 2 nombres
     * @param a : facteur 1
     * @param b : facteur 2
     * @return : résultat de l'opération
     */
    public float multiplier (float a, float b) {
        return a * b;
    }
    /**
     * réaliser division sur 2 nombres
     * @param a : dividande
     * @param b : diviseur
     * @return : résultat de l'opération
     */
    public float diviser (float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("le dénominateur est égal à 0");
        } else {
            return a / b;
        }
    }

}
