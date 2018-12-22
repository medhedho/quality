package ecommerce;

import ecommerce.Business.EsBusiness;
import ecommerce.Business.Interfaces.LivreBusiness;
import ecommerce.Entities.Client;
import ecommerce.Entities.Livre;
import ecommerce.Entities.Panier;
import ecommerce.Entities.Promotion;
import ecommerce.Repositories.ClientRepository;
import ecommerce.Repositories.LivreRepository;
import ecommerce.Repositories.PanierRepository;
import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.*;

@SpringBootApplication
@EnableJpaRepositories("ecommerce.Repositories")
//@EnableTransactionManagement
@EnableGlobalMethodSecurity(securedEnabled = true)
public class EcommerceApplication {

    private static final Logger log = LoggerFactory.getLogger(EcommerceApplication.class);


    @Configuration
    static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                    .withUser("user").password("{noop}user").roles("USER").and()
                    .withUser("hero").password("{noop}hero").roles("USER","HERO");
        }


    }



    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }


    @Bean  //
    @Transactional //try in service
    public CommandLineRunner demo(ClientRepository repository, EsBusiness eb, PanierRepository prep, LivreRepository lr, LivreBusiness lb) {
        return (args) -> {



/*
            Client c1 = new Client("Lannister", "Tyrion");
            Client c2 = new Client("Targaryen", "Daenerys");
            Client c3 = new Client("Snow", "Jon");
            Client c4 = new Client("Baratheon", "Stannis");
            Client c5 = new Client("Stark", "Eddard");

            Livre l1 = new Livre ("Dracula", "Bram Stoker", 1897, 2.5);
            Livre l2 = new Livre ("LÎle au Trésor", "Robert Louis Stevenson", 1790, 2);
            Livre l3 = new Livre ("Les 3 Mousquetaires", "Alexandre Dumas", 1756, 2);

            Promotion pr1 = new Promotion(20, new Date(2018, 11, 1), new Date(2019, 1, 31), l1);

            Panier p1 = new Panier(c1);
            p1.getLivres().add(l1);
            p1.getLivres().add(l3);

            Panier p2 = new Panier(c2);
            p2.getLivres().add(l2);
            p2.getLivres().add(l3);

            l1.getPaniers().add(p1);
            l2.getPaniers().add(p2);
            l3.getPaniers().add(p1);
            l3.getPaniers().add(p2);

            prep.save(p1);
            prep.save(p2);
            repository.save(c3);
            repository.save(c4);
            repository.save(c5);
            */

/*
            Client cl = repository.findByNomAndPrenom("Targaryen", "Daenerys");
            // Hibernate.initialize(cl.getPanier().getLivres());   try in service
            Livre li = lr.findById(1L).get();

            lb.mettreAuPanier(cl,li);
            prep.save(cl.getPanier());
*/


          /*  repository.findByPrenom("Chloe").forEach(bauer -> {
                log.info(bauer.toString());
            });

            // fetch all customers
            log.info("Client found with findAll():");
            log.info("-------------------------------");
            for (Client customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Client found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });*/

            //eb.getCrudHandler().save(new Client("Hedi", "Houas"));
        };
    }


}
