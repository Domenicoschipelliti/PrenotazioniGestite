package Domenico.GestionePrenotazioni.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Edificio {

   private String nome;

   private String indirizzo;

   private String citta;

   @ManyToOne
   private List<PostazioniAziendali> postazioniAziendali;

   public Edificio(String nome, String indirizzo, String citta) {
      this.nome = nome;
      this.indirizzo = indirizzo;
      this.citta = citta;
   }

   public Edificio() {
   }
}
