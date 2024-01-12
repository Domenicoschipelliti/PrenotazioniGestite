package Domenico.GestionePrenotazioni.enteties;

import Domenico.GestionePrenotazioni.Enum.Tipo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@Getter
@Setter
@Entity
public class PostazioniAziendali {
     @Id
     @GeneratedValue
     @Getter
     private long id;

     private String descrizione;

     @Enumerated(EnumType.STRING)
     private Tipo tipo;

     private int numeroMassimoOccupanti;

     @ManyToOne
     private Edificio edificio;


    public PostazioniAziendali(String descrizione, Tipo tipo, int numeroMassimoOccupanti) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public PostazioniAziendali() {
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
