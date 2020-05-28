package restaurant.restaurant.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="cartes")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Carte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nom;
    private String email;
    private String num_tele;
    private  int nbr_point;
    @OneToOne
    private Client clients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum_tele() {
        return num_tele;
    }

    public void setNum_tele(String num_tele) {
        this.num_tele = num_tele;
    }

    public int getNbr_point() {
        return nbr_point;
    }

    public void setNbr_point(int nbr_point) {
        this.nbr_point = nbr_point;
    }
}
