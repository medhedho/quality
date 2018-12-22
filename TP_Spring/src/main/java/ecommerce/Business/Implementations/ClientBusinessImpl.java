package ecommerce.Business.Implementations;

import ecommerce.Business.Interfaces.ClientBusiness;
import ecommerce.Entities.Client;
import ecommerce.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBusinessImpl implements ClientBusiness {

    @Autowired
    private ClientRepository cl;

    @Override
    public List<Client> afficherTout() {
        return cl.findAll();
    }
}
