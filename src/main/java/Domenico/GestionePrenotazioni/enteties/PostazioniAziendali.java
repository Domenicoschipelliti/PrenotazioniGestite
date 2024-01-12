package Domenico.GestionePrenotazioni.enteties;

import Domenico.GestionePrenotazioni.Enum.Tipo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PostazioniAziendali {
     @Id
     @GeneratedValue
     private long id;

     private String descrizione;

     @Enumerated(EnumType.STRING)
     private Tipo tipo;

     private int numeroMassimoOccupanti;

     @ManyToOne
     @JoinColumn
     private Edificio edificio;


    public PostazioniAziendali(String descrizione, Tipo tipo, int numeroMassimoOccupanti) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public PostazioniAziendali() {
    }

    public long getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNumeroMassimoOccupanti() {
        return numeroMassimoOccupanti;
    }

    public Edificio getEdificio() {
        return edificio;
    }


    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setNumeroMassimoOccupanti(int numeroMassimoOccupanti) {
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "PostazioniAziendali{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", numeroMassimoOccupanti=" + numeroMassimoOccupanti +
                ", edificio=" + edificio +
                '}';
    }

}
