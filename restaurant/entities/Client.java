package restaurant.restaurant.entities;


import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="clients")
public class Client extends User implements Serializable {

    private String num_tele;
    @OneToMany(mappedBy = "clients")
    private List<Contact> contacts;
    @OneToMany(mappedBy = "clients")
    private List<Reservation> reservations;
    @OneToOne
    private Passeport passeport;
    @OneToOne
    private Carte carte;



    public String getNum_tele() {
        return num_tele;
    }

    public void setNum_tele(String num_tele) {
        this.num_tele = num_tele;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
