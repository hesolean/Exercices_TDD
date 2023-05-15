package Exercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercice4TestNombre {
    private Exercice4 exercice4;

    @BeforeEach
    void setUp(){
        exercice4 = new Exercice4();
    }

    @Test
    public void testNombre(){
        assertEquals("2", exercice4.transformationIntegerEnFizzBuzz(2));
    }
}
