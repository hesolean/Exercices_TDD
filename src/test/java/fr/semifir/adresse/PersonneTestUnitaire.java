package fr.semifir.adresse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PersonneTestUnitaire {
    // On a déjà testé la méthode demenager(adresse) est déjà testée
    // On veut tester la méthode demenager(personne) donc il faut utiliser un Mock

    Personne personne;
    Adresse adresseMock;

    // On veut set up le Mock avant chaque test donc il faut un @BeforeEach
    @BeforeEach
    void setUp() {
        // On crée le Mock
        adresseMock = Mockito.mock(Adresse.class);
        // On instencie le Mock avec LA MEME ADRESSE que dans le fichier test de l'adresse
        adresseMock.numero = "15";
        adresseMock.voie = "rue de l'espérance";
        adresseMock.ville = "Bonne nouvelle";
        adresseMock.pays = "Là-bas";
        adresseMock.codePostal = 12365;

        // On définit le comportement
        Mockito.when(adresseMock.demenager(
                //Mockito.anyString() permet de dire que nous ne savons pas quelle valeur sera passée
                //en paramètre et sur le principe, on s'en moque
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyString(),
                Mockito.anyString(),
                // anyInt() permet de dire que nous ne savons pas quelle valeur sera passée en paramètre
                Mockito.anyInt()
                )
                // ici nous retournons la même adresse d'origine
                // Rappel : la nouvelle valeur ne nous interesse pas
                // dans le cas contraire, nous aurions pu faire un nouveau mock.
        ).thenReturn(adresseMock);

        // nous créons ensuite notre personne, et lui passons notre mock en paramètre.
        personne = new Personne("prénom", "nom", adresseMock);
    }

    @Test
    void testDemenager() {
        Given:
        personne.adresse = adresseMock;

        When:
        personne.demenager(personne.adresse);

        Then:
        // On se contente de vérifier que la méthode demenager(adresse) est appelée
        Mockito.verify(
                    adresseMock,
                    Mockito.times(1)
                            // la description est optionnelle
                            .description("message perso pour dire que cela s'est bien passé")
                )
                .demenager(
                        //Mockito.anyString() permet de dire que nous ne savons pas quelle valeur sera passée
                        //en paramètre et sur le principe, on s'en moque
                        Mockito.anyString(),
                        Mockito.anyString(),
                        Mockito.anyString(),
                        Mockito.anyString(),
                        // anyInt() permet de dire que nous ne savons pas quelle valeur sera passée en paramètre
                        Mockito.anyInt()
                );
    }
}
