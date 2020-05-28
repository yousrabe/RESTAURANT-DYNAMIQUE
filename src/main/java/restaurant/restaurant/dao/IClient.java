package restaurant.restaurant.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.restaurant.entities.Client;

@Repository
public interface IClient extends JpaRepository<Client,Long> {
}
