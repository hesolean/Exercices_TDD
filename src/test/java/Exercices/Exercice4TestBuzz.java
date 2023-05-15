package Exercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercice4TestBuzz {
    private Exercice4 exercice4;

    @BeforeEach
    void setUp(){
        exercice4 = new Exercice4();
    }

    @Test
    public void testBuzz(){
        assertEquals("Buzz", exercice4.transformationIntegerEnFizzBuzz(10));
    }
}
