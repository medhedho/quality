package ecommerce.Web;

import ecommerce.Business.Implementations.ClientBusinessImpl;
import ecommerce.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientBusinessImpl cbi;

    @RequestMapping("/clients")
    public List<Client> afficherTout() {
        return cbi.afficherTout();
    }

}
