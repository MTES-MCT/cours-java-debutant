package fr.gouv.e2.cours.demo.metier;

public class Personne {
    private String nir;
    private String nom;
    private String prenom;
    public Genre genre;

    public Personne(Genre genre, String prenom, String nom, String nir){
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.nir = nir;
    }

    public String nir(){
        return this.nir;
    }

    public String afficherNom(){
        return this.nom;
    }

    public String toString(){
        return this.genre.name() + this.nom + this.prenom;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nir == null) ? 0 : nir.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nir.equals(((Personne) obj).nir);
    }
    
}