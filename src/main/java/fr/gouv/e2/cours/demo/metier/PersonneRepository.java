package fr.gouv.e2.cours.demo.metier;

import java.util.List;

public interface PersonneRepository {

    public Personne recupereParNir(String nir);
    public void enregistrer(Personne personne);
    public List<Personne> rechercheToutes();
    
}