package restaurant.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="reservations")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt","updatedAt"},allowGetters = true)

public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nom;
    private String nbre_de_personne;
    private String num_tele;
    private String mail;
    @CreatedBy
    @Column(name = "created_by")
  private String createdBy;
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
   @CreatedDate
   private Date createdAt;
   @Column(nullable = false)
   @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updateCreate;
    @ManyToOne
    private Restaurant restaurants;
    @ManyToOne
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

    public String getNbre_de_personne() {
        return nbre_de_personne;
    }

    public void setNbre_de_personne(String nbre_de_personne) {
        this.nbre_de_personne = nbre_de_personne;
    }

    public String getNum_tele() {
        return num_tele;
    }

    public void setNum_tele(String num_tele) {
        this.num_tele = num_tele;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateCreate() {
        return updateCreate;
    }

    public void setUpdateCreate(Date updateCreate) {
        this.updateCreate = updateCreate;
    }
}
