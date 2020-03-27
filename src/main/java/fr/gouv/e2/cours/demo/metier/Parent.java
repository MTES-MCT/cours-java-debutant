package fr.gouv.e2.cours.demo.metier;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Personne {

    public Parent(Genre genre, String prenom, String nom, String nir) {
        super(genre, prenom, nom, nir);
    }

    private List<Personne> enfants = new ArrayList<Personne>();

    public void ajouterEnfant(Personne enfant) {
        this.enfants.add(enfant);
    }

    public String toString(){
        return "Parent " + super.toString();
    }

    
}