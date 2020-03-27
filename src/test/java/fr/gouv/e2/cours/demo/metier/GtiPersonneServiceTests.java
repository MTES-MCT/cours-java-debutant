package fr.gouv.e2.cours.demo.metier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.gouv.e2.cours.demo.infra.persistence.inmemory.InMemoryPersonneRepository;

public class GtiPersonneServiceTests {

    @Test
    public void testCompterPersonnes(){
        PersonneRepository personneRepository = new InMemoryPersonneRepository();
        PersonneService service = new GtiPersonneService(personneRepository);
        assertEquals(0, service.compterPersonnes());
        personneRepository.enregistrer(new Personne(Genre.HOMME, "Quere", "Dominique", "0"));
        assertEquals(1, service.compterPersonnes());
    }
    
}