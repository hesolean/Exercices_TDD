package Exercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercice3Test {
    private Exercice3 exercice3;

    @BeforeEach
    void setUp() {
        exercice3 = new Exercice3();
    }

    @Test
    public void testInverserMot() {
        assertEquals("tnemellennoitutitsnocitna", exercice3.inverserMot("anticonstitutionnellement"));
    }
}
