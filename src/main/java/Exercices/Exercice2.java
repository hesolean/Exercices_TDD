package Exercices;

public class Exercice2 {
    // méthode palidrome
    String mot;
    public boolean pal(String mot) {
        int i = 0, longueur = mot.length() - 1;
        boolean egale = true;
        /*tester le premier caractère avec le dernier
         *et s'ils sont égaux, le programme continu
         *à dérouler la boucle while et tester
         *le caractère suivant(i+1 avec longeur-(i+1))
         *jusqu'à i soit égale à longueur/2,
         *, sinon le booléen egale reçoit false
         *donc, la fonction pal retourne false
         */
        while (i < longueur / 2 && egale) {
            if (mot.charAt(i) == mot.charAt(longueur - i))
                egale = true;
            else if (mot == null || mot.length() == 0)
                egale = false;
            else
                egale = false;
            i++;
        }
        return egale;
    }
}
