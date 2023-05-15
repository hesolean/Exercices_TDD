package fr.semifir.calculatrice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// on met * pour importer toutes les assertions en même temps

public class CalculatriceTest {
    // création attribut privé de type Calculatrice
    // sera instanciée dans une méthode @BeforeEach
    private Calculatrice calculatrice;

    //attributs pour généraliser le code
    float a;
    float b;
    float result;


    // prépare les tests en instanciant une calculatrice avant chaque test
    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice();
    }

    // l'annotation (et non décorateur en java!) sert à définir un test
    @Test
    public void testAdditionnerDeuxNombres() {
        //utilisation de l'assertion "assertEquals" pour comparer deux valeurs
        //la première valeur est la valeur attendue
        //la deuxième valeur est la valeur renvoyée par la méthode
        //enfin il y a le message en cas d'échec pour savoir ce qui ne va pas

        //assertEquals(3, calculatrice.additionner(0.1f, 2.9f), //doit ajouter f après le nombre pour préciser que c'est un float
        //        "L'addition de 0.1 et 2.9 doit donner 3");

        //bdd : given, when, then
        Given:
        a = 0.1f;
        b = 2.9f;

        When:
        result = calculatrice.additionner(a,b);

        Then:
        assertEquals(3, result, "L'addition de 0.1 et 2.9 doit donner 3");
    }

    //@Displayname permet de renommer le test avec des caractères spéciaux.
    //On le voit dans la console de résultat des tests
    @DisplayName("je teste la soustraction de 2 nombres")
    @Test
    public void testSoustraireDeuxNombres() {
        Given:
        a = 3.1f;
        b = 3.1f;

        When:
        result = calculatrice.soustraire(a,b);

        Then:
        assertEquals(0,result,"La soustraction de 3.1 et 3.1 doit donner 0");
    }

    @Test
    public void testMultiplierDeuxNombres() {
        Given:
        a = 0.1f;
        b = 3.1f;

        When:
        result = calculatrice.multiplier(a,b);

        Then:
        assertEquals(0.31f,result,"La multiplication de 0.1 par 3.1 doit donner 0.31");
    }

    @Test
    public void testDiviserDeuxNombres() {
        Given:
        a = 3;
        b = 1;

        When:
        result = calculatrice.diviser(a,b);

        Then:
        assertEquals(3,result,"La division de 3 par 1 doit donner 3");
    }

    @DisplayName("division par zéro")
    @Test
    public void testDiviserParZero() {
        // On déclare une variable dont le type correspond
        // à l'exception que l'on souhaite attraper
        IllegalArgumentException exception;
        Given:
        a = 3;
        b = 0;

        When:
        // on utilise la méthode "assertThrows" qui permet des tester l'exception
        // elle prend en paramètre la classe de l'exception
        // et une fonction lambda qui contient le code à tester
        exception = assertThrows(IllegalArgumentException.class,
                () -> calculatrice.diviser(a,b));

        Then:
        // On compare le message de l'exception avec celui que la fonction renvoie
        assertEquals("le dénominateur est égal à 0",exception.getMessage());

        // autre méthode :
        //assertEquals(IllegalArgumentException.class, exception.getClass());
    }
}
