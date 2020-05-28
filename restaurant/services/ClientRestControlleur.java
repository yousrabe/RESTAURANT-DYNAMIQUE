package restaurant.restaurant.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.IClient;
import restaurant.restaurant.entities.Client;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("clients")
public class ClientRestControlleur {
    @Autowired
    
    private IClient iClient;
    @GetMapping("/all")
    public List<Client> getAllClients() {

        return iClient.findAll();
    }
    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {

        return iClient.save(client);
    }
    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client) {

        return iClient.saveAndFlush(client);
    }
    @DeleteMapping("/remove")
    public String deleteClient( @RequestBody  Long id) {

        try {
            iClient.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }
}
