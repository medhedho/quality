package ecommerce;

import ecommerce.Entities.Client;
import ecommerce.Repositories.ClientRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientRepositoryTests {
/*
    @Autowired
    private ClientRepository cr;

    Client c1;
    Client c2;

    @Before
    public void setUp(){
        c1 = new Client("Chan", "Jackie");
        c2 = new Client("Li", "Jet");
        cr.save(c1);
        cr.save(c2);
    }
    @Test
    public void contextLoads() {
        assertThat(cr.findByNomAndPrenom("Chan","Jackie")).isNotNull();
        assertThat(cr.findByNomAndPrenom("Li","Jet")).isNotNull();

    }

    @After
    public void shutDown(){
        cr.delete(c1);
        cr.delete(c2);
    }


    @Test
    public void testFindByPrenom() {

    Client prof = cr.save(new Client("Marquinha", "Sergio"));
    assertThat(cr.findByPrenom("Sergio")).extracting(Client::getPrenom).containsOnly(prof.getPrenom());
    }
    */
}
