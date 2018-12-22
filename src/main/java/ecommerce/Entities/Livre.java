package ecommerce.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idlivre;

    private String nom;
    private String auteur;
    private int annee;
    private double prix;


    public Long getIdlivre() {
        return idlivre;
    }

    public void setIdlivre(Long idlivre) {
        this.idlivre = idlivre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    protected Livre() {}

    public Livre(String nom, String auteur, int annee, double prix) {
        this.nom = nom;
        this.auteur = auteur;
        this.annee = annee;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return String.format(
                "Livre[id=%d, nom='%s', auteur='%s']",
                idlivre, nom, auteur);
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "livre")
    private Set<Promotion> promos;

    public Set<Promotion> getPromos() {
        return promos;
    }

    public void setPromos(Set<Promotion> promos) {
        this.promos = promos;
    }

    @ManyToMany(/*cascade = CascadeType.ALL,*/ mappedBy = "livres")
    private Set<Panier> paniers = new HashSet<>();

    public Set<Panier> getPaniers() {
        return paniers;
    }

    public void setPaniers(Set<Panier> paniers) {
        this.paniers = paniers;
    }
}
