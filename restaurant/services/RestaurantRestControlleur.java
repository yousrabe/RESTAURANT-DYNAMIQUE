package restaurant.restaurant.services;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.IRestaurant;
import restaurant.restaurant.entities.Restaurant;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("Restaurants")
public class RestaurantRestControlleur {
    @Autowired
    private IRestaurant iRestaurant;
    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {

        return iRestaurant.findAll();
    }
    @PostMapping("/add")
    public Restaurant addRestaurant(Restaurant restaurant) {

        return iRestaurant.save(restaurant);
    }
    @PutMapping("/update")
    public Restaurant updateRestaurant(Restaurant restaurant) {

        return iRestaurant.saveAndFlush(restaurant);
    }
    @DeleteMapping("/remove")
    public String deleteRestaurant(Long id) {

        try {
            iRestaurant.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }
}
