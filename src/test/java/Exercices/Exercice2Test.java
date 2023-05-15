package Exercices;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercice2Test {
    private Exercice2 exercice2;
    private String mot;
    private boolean result;

    @BeforeEach
    void setUp(){
        exercice2 = new Exercice2();
    }

    @Test
    public void testPalidrome(){
        assertTrue(exercice2.pal("hannah"));
        assertFalse(exercice2.pal("moi"));
    }


}
