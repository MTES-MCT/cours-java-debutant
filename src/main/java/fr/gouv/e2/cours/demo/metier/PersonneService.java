package fr.gouv.e2.cours.demo.metier;

public class PersonneService {

    public int compterPersonnes(){
        Personne dominique = new Personne("Dominique", "Quere", "0");
        Parent mathieu = new Parent("Mathieu", "DeKerleau", "1");
        mathieu.ajouterEnfant(new Personne("petit", "bob", "2"));
        mathieu.equals(dominique);
        return 0;
    }
}