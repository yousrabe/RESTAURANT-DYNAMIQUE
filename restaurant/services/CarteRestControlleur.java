package restaurant.restaurant.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.ICarte;
import restaurant.restaurant.entities.Carte;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("cartes")
public class CarteRestControlleur {
    @Autowired
    private ICarte iCarte;
    @GetMapping("/all")
    public List<Carte> getAllCartes() {

        return iCarte.findAll();
    }
    @PostMapping("/add")
    public Carte addCarte(Carte carte) {

        return iCarte.save(carte);
    }
    @PutMapping("/update")
    public Carte updateCarte(Carte carte) {

        return iCarte.saveAndFlush(carte);
    }
    @DeleteMapping("/remove")
    public String deleteCarte(Long id) {

        try {
            iCarte.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }
}

