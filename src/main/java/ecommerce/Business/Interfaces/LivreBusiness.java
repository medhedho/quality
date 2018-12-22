package ecommerce.Business.Interfaces;

import ecommerce.Entities.Client;
import ecommerce.Entities.Livre;

import java.util.List;

public interface LivreBusiness {

    void mettreAuPanier(Client c, Livre b);

    List<Livre> afficherTout();
}
