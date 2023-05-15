package fr.semifir.adresse;

public class Personne {
//    ### EPIC : Personne
//
//- En tant qu'utilisateur, je veux pouvoir créer une personne
//            - En tant qu'utilisateur, lorsque je créé une personne,
//            je souhaite indiquer son nom, son prénom et son adresse
//            - En tant qu'utilisateur,
//            je souhaite pouvoir indiquer que la personne a déménagé
//            - En tant qu'utilisateur, lorsqu'une personne déménage,
//            je souhaite indiquer sa nouvelle adresse
//- En tant qu'utilisateur, lorsqu'une personne déménage, je ne souhaite pas obtenir de confirmation de déménagement
    String nom, prenom;
    Adresse adresse;
    public Personne(String prenom, String nom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void demenager(Adresse adresse) {
        adresse.demenager(adresse.numero, adresse.voie, adresse.ville, adresse.pays, adresse.codePostal);
    }
}
