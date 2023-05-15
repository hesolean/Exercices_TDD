package fr.semifir.adresse;

public class Adresse {
//- En tant qu'utilisateur, je veux pouvoir créer une adresse
//            - En tant qu'utilisateur, lorsque je créé une adresse,
//            je souhaites indiquer le numéro de rue, le nom de la rue, le code postal et la ville
//            - En tant qu'utilisateur, lorsque je souhaites créer une adresse,
//            je veux pouvoir saisir le numéro de rue sous forme de chaine de caractères
//            - En tant qu'utilisateur, lorsque je souhaites créer une adresse,
//            je veux pouvoir saisir le code postal sous forme de chaine de nombres
//            - En tant qu'utilisateur, je souhaites pouvoir déménager à une nouvelle adresse
//            - En tant qu'utilisateur, lorsque je déménage,
//            je veux pouvoir saisir les mêmes informations que lorsque je créé une adresse
//            - En tant qu'utilisateur, lorsque je déménage,
//            je souhaite recevoir la nouvelle adresse pour m'assurer que le déménagement s'est bien passé
//
//            ### EPIC : Personne
//
//- En tant qu'utilisateur, je veux pouvoir créer une personne
//            - En tant qu'utilisateur, lorsque je créé une personne, je souhaite indiquer son nom, son prénom et son adresse
//            - En tant qu'utilisateur, je souhaite pouvoir indiquer que la personne a déménagé
//            - En tant qu'utilisateur, lorsqu'une personne déménage, je souhaite indiquer sa nouvelle adresse
//- En tant qu'utilisateur, lorsqu'une personne déménage, je ne souhaite pas obtenir de confirmation de déménagement

    public String numero, voie, ville, pays;
    public int codePostal;

    public Adresse(String numero, String voie, String ville, String pays, int codePostal) {
        this.numero = numero;
        this.codePostal = codePostal;
        this.pays = pays;
        this.ville = ville;
        this.voie = voie;
    }

    public Adresse demenager(String numero, String voie, String ville, String pays, int codePostal) {
        this.numero = numero;
        this.codePostal = codePostal;
        this.pays = pays;
        this.ville = ville;
        this.voie = voie;
        return this;
    }
}
