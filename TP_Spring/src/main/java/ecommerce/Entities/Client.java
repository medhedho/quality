package ecommerce.Entities;
import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idclient;

    private String nom;
    private String prenom;

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected Client() {}

    public Client(String lastName, String firstName) {
        this.prenom = firstName;
        this.nom = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Client[id=%d, nom='%s', prenom='%s']",
                idclient, nom, prenom);
    }

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
    private Panier panier;

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

}
// @SpringBootTest mouch @JpaTest