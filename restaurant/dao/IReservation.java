package restaurant.restaurant.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.restaurant.entities.Reservation;

@Repository
public interface IReservation extends JpaRepository<Reservation,Long> {
}
