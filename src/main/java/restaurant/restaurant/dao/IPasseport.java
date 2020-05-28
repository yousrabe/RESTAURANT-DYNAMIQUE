package restaurant.restaurant.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.restaurant.entities.Passeport;

@Repository
public interface IPasseport extends JpaRepository<Passeport,Long> {
}
