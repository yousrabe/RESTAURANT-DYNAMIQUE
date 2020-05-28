package restaurant.restaurant.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restaurant.restaurant.entities.Contact;

@Repository
public interface IContact extends JpaRepository<Contact,Long> {
}
