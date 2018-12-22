package ecommerce.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idpromo;

    private double pourcentage;
    private Date debut;
    private Date fin;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Livre livre;

    public Long getIdpromo() {
        return idpromo;
    }

    public void setIdpromo(Long idpromo) {
        this.idpromo = idpromo;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Promotion() {
    }

    public Promotion(double pourcentage, Date debut, Date fin, Livre livre) {
        this.pourcentage = pourcentage;
        this.debut = debut;
        this.fin = fin;
        this.livre = livre;
    }
}
