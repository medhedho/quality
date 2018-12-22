package ecommerce.Web;

import ecommerce.Business.Implementations.LivreBusinessImpl;
import ecommerce.Entities.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivreController {

    @Autowired
    LivreBusinessImpl lbi;

    @RequestMapping("/livres")
    public List<Livre> afficherTout() {
        return lbi.afficherTout();
    }


}
