package fr.gouv.e2.cours.demo.infra.persistence.postgresql;

import java.util.List;

import fr.gouv.e2.cours.demo.metier.Personne;
import fr.gouv.e2.cours.demo.metier.PersonneRepository;



public class PostgreSQLPersonneRepository implements PersonneRepository {

    @Override
    public Personne recupereParNir(String nir) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Personne> rechercheToutes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void enregistrer(Personne personne) {
        // TODO Auto-generated method stub

    }

    
}