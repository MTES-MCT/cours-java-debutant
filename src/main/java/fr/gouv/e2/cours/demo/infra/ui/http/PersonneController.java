package fr.gouv.e2.cours.demo.infra.ui.http;

import java.net.http.HttpRequest;

import fr.gouv.e2.cours.demo.metier.PersonneService;

public class PersonneController {

    private PersonneService personneService;

    // GET /personnes/nombre
    public int getNombrePersonnes(HttpRequest request){
        int nombre = personneService.compterPersonnes();
        return nombre;
    }
    
}