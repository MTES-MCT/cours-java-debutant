package fr.gouv.e2.cours.demo.metier;

import java.util.List;

public class GtiPersonneService implements PersonneService {

    private PersonneRepository personneRepository;

    public int compterPersonnes(){
        return this.personneRepository.rechercheToutes().size();
    }

    public GtiPersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }
}