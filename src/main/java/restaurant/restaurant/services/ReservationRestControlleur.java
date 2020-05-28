
package restaurant.restaurant.services;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.IReservation;
import restaurant.restaurant.entities.Reservation;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("Reservations")
public class ReservationRestControlleur {
    @Autowired
    private IReservation iReservation;
    @GetMapping("/all")
    public List<Reservation> getAllReservations() {

        return iReservation.findAll();
    }
    @PostMapping("/add")
    public Reservation addReservation(Reservation reservation) {

        return iReservation.save(reservation);
    }
    @PutMapping("/update")
    public Reservation updateReservation(Reservation reservation) {

        return iReservation.saveAndFlush(reservation);
    }
    @DeleteMapping("/remove")
    public String deleteReservation(Long id) {

        try {
            iReservation.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }
}
