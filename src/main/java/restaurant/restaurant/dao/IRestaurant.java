package restaurant.restaurant.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.restaurant.entities.Restaurant;

@Repository
public interface IRestaurant extends JpaRepository<Restaurant,Long> {
}
