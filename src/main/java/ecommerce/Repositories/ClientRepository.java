package ecommerce.Repositories;

import java.util.List;

import ecommerce.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @RestResource(path = "parPrenom")
    List<Client> findByPrenom(@Param("prenom") String prenom);

    @RestResource(path = "parNomPrenom")
    Client findByNomAndPrenom(@Param("nom") String nom, @Param("prenom") String prenom);

}
