package Domenico.GestionePrenotazioni.enteties;

import Domenico.GestionePrenotazioni.Enum.Tipo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PostazioniAziendali {
     @Id
     @GeneratedValue
     @Getter
     private long id;

     private String descrizione;

     @Enumerated(EnumType.STRING)
     private Tipo tipo;

     private int numeroMassimoOccupanti;

     @OneToMany
     private Edificio edificio;


    public PostazioniAziendali(String descrizione, Tipo tipo, int numeroMassimoOccupanti) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public PostazioniAziendali() {
    }
}
