package restaurant.restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurant.restaurant.dao.IContact;
import restaurant.restaurant.entities.Contact;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("contacts")
public class ContactRestControlleur {
    @Autowired
    private IContact iContact;
    @GetMapping("/all")
    public List<Contact> getAllContacts() {

        return iContact.findAll();
    }
    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {

        return iContact.save(contact);
    }
    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact contact) {

        return iContact.saveAndFlush(contact);
    }
    @DeleteMapping("/remove")
    public String deleteContact( @RequestBody Long id) {

        try {
            iContact.deleteById(id);

            return "yes";
        } catch (Exception e) {

            return "no";


        }
    }


}

