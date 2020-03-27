package fr.gouv.e2.cours.demo.infra.persistence.inmemory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.gouv.e2.cours.demo.metier.Personne;
import fr.gouv.e2.cours.demo.metier.PersonneRepository;

public class InMemoryPersonneRepository implements PersonneRepository {

    private Map<String,Personne> personnes;

    public InMemoryPersonneRepository() {
        this.personnes = new HashMap<String,Personne>();
    }

    @Override
    public Personne recupereParNir(String nir) {
        return this.personnes.get(nir);
    }

    @Override
    public List<Personne> rechercheToutes() {
        return new ArrayList<Personne>(this.personnes.values());
    }

    @Override
    public void enregistrer(Personne personne) {
        this.personnes.put(personne.nir(), personne);
    }
    
}