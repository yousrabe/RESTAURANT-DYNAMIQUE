package restaurant.restaurant.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="passeports")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Passeport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)


    private Long id;
    private String nom_pass;
    private String ville;
    @OneToOne
    private Client clients;

    public Long getId_passeport() {
        return id;
    }

    public void setId_passeport(Long id) {
        this.id = id;
    }

    public String getNom_pass() {
        return nom_pass;
    }

    public void setNom_pass(String nom_pass) {
        this.nom_pass = nom_pass;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
