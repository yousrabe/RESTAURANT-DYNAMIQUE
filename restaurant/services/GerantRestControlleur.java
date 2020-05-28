package restaurant.restaurant.services;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.IGerant;
import restaurant.restaurant.entities.Gerant;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("gerants")
public class GerantRestControlleur {
    @Autowired
    private IGerant iGerant;
    @GetMapping("/all")
    public List<Gerant> getAllGerants() {

        return iGerant.findAll();
    }
    @PostMapping("/add")
    public Gerant addGerant(Gerant gerant) {

        return iGerant.save(gerant);
    }
    @PutMapping("/update")
    public Gerant updateGerant(Gerant gerant) {

        return iGerant.saveAndFlush(gerant);
    }
    @DeleteMapping("/remove")
    public String deleteGerant(Long id) {

        try {
            iGerant.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }
}

