package fr.gouv.e2.cours.demo.metier;

import java.util.List;

public class GtiPersonneService implements PersonneService {

    private PersonneRepository personneRepository;

    public int compterPersonnes(){
        List<Personne> personnes = personneRepository.rechercheToutes();
        return personnes.size();
    }
}