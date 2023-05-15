package Exercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercice1Test {
    private Exercice1 exercice1;

    private String prenom, nom, result;

    @BeforeEach
    void setUp() {
        exercice1 = new Exercice1();
    }

    @Test
    public void testRenvoieBonjourNom() {
        Given:
        prenom = "François";
        nom = "Salmon";

        When:
        result = exercice1.renvoieBonjourNom("François", "Salmon");

        Then:
        assertEquals("Bonjour François Salmon", result, "On ne retourne pas bonjour avec nom et prénom");
    }

}
