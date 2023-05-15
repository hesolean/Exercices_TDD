package Exercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercice5Test {
    private Exercice5 exercice5;
    private int annee;

    @BeforeEach
    void setUp() {
        exercice5 = new Exercice5();
    }

    @Test @DisplayName("Teste que les multiples de 4 renvoie true")
    public void testMultiples4() {
        assertTrue(exercice5.anneesBissextiles(4));
        assertTrue(exercice5.anneesBissextiles(16));
        assertTrue(exercice5.anneesBissextiles(40));
    }

    @Test @DisplayName("Teste que les multiples de 4 et 100 renvoie false")
    public void testMultiples4100() {
        assertFalse(exercice5.anneesBissextiles(4));
        assertFalse(exercice5.anneesBissextiles(100));
        assertFalse(exercice5.anneesBissextiles(1900));
    }

    @Test @DisplayName("Teste que les multiples de 4, 100 et 400 renvoie true")
    public void testMultiples4100400() {
        assertTrue(exercice5.anneesBissextiles(4));
        assertTrue(exercice5.anneesBissextiles(100));
        assertTrue(exercice5.anneesBissextiles(400));
        assertTrue(exercice5.anneesBissextiles(2400));
    }

    @Test @DisplayName("Teste que renvoie un boolean")
    public void testReponse() {
        assert(exercice5.anneesBissextiles(4));
}
