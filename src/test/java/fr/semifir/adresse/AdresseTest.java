package fr.semifir.adresse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdresseTest {
    Adresse adresse;

    @Test
    void testDemenager() {
        Given:
        adresse = new Adresse("15", "rue de l'espérance", "Bonne nouvelle", "Là-bas", 12365);

        When:
        adresse.demenager("51", "rue de l'espoir", "Bonne nouvelle", "Là-bas", 12365);

        Then:
        assertEquals("51", adresse.numero);
        assertEquals("rue de l'espoir", adresse.voie);
        assertEquals("Bonne nouvelle", adresse.ville);
        assertEquals("Là-bas", adresse.pays);
        assertEquals(12365, adresse.codePostal);
// On peut utiliser assertSame pour comparer l'objet en une fois
    }
}
