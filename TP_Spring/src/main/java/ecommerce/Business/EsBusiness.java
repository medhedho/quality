package ecommerce.Business;

import ecommerce.Entities.Client;
import ecommerce.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EsBusiness {

    public ClientRepository getCrudHandler() {
        return crudHandler;
    }

    @Autowired
    private ClientRepository crudHandler;

}
