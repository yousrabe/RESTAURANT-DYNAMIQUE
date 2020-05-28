package restaurant.restaurant.services;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.IPasseport;
import restaurant.restaurant.entities.Passeport;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("passeports")
public class PasseportRestControlleur {
    @Autowired
    private IPasseport iPasseport;
    @GetMapping("/all")
    public List<Passeport> getAllPasseports() {

        return iPasseport.findAll();
    }
    @PostMapping("/add")
    public Passeport addPasseport(Passeport passeport) {

        return iPasseport.save(passeport);
    }
    @PutMapping("/update")
    public Passeport updatePasseport(Passeport passeport) {

        return iPasseport.saveAndFlush(passeport);
    }
    @DeleteMapping("/remove")
    public String deletePasseport(Long id) {

        try {
            iPasseport.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }
}
