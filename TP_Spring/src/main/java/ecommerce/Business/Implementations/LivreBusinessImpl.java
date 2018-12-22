package ecommerce.Business.Implementations;

import ecommerce.Business.Interfaces.LivreBusiness;
import ecommerce.Entities.Client;
import ecommerce.Entities.Livre;
import ecommerce.Repositories.LivreRepository;
import ecommerce.Repositories.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreBusinessImpl implements LivreBusiness {

    @Autowired
    PanierRepository pr;

    @Autowired
    LivreRepository lr;

    @Override
    public void mettreAuPanier(Client c, Livre b)
    {
       c.getPanier().getLivres().add(b);
       pr.save(c.getPanier());
    }

    @Override
    public List<Livre> afficherTout()
    {
        return lr.findAll();
    }

}