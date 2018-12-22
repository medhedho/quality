package ecommerce.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idpanier;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Client client;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "Paniers_Livres",
            joinColumns = { @JoinColumn(name = "idpanier") },
            inverseJoinColumns = { @JoinColumn(name = "idlivre") })
    @JsonIgnore
    private Set<Livre> livres = new HashSet<>();

    public Long getIdpanier() {
        return idpanier;
    }

    public void setIdpanier(Long idpanier) {
        this.idpanier = idpanier;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    public Panier() {
    }

    public Panier(Client client) {
        this.client = client;
    }
}
