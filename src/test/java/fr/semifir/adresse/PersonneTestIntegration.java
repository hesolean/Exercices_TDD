package fr.semifir.adresse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PersonneTestIntegration {
    Personne personne;
    Adresse adresseSpy;

    @BeforeEach
    void setUp() {
        // On instencie une vraie adresse
        Adresse adresse = new Adresse("15", "rue de l'espérance", "Bonne nouvelle", "Là-bas", 12365);

        // On déclare un espion à partir de notre instance réelle
        adresseSpy = Mockito.spy(adresse);


        //https://dzone.com/refcardz/mockito
        //https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html

        Mockito.doReturn(adresseSpy)
                .when(adresseSpy).demenager(
                        Mockito.anyString(),
                        Mockito.anyString(),
                        Mockito.anyString(),
                        Mockito.anyString(),
                        Mockito.anyInt()
                        );
        personne = new Personne("prénom", "nom", adresse);
    }

    @Test
    void testDemenager() {
        Given:
        personne.adresse = adresseSpy;

        When:
        personne.demenager(personne.adresse);

        Then:
        Mockito.verify(
                adresseSpy,
                Mockito.times(1).description("message perso")
        ).demenager(
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyInt()
        );
    }
}
