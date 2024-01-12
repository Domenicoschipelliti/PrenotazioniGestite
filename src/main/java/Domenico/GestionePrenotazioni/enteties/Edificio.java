package Domenico.GestionePrenotazioni.enteties;

import Domenico.GestionePrenotazioni.DAO.EdificoService;
import Domenico.GestionePrenotazioni.DAO.PostazioniAziendaliService;
import Domenico.GestionePrenotazioni.DAO.UtenteService;
import Domenico.GestionePrenotazioni.Enum.Tipo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Component
public class Edificio {
   @Id
   @GeneratedValue
   private long id;

   private String nome;

   private String indirizzo;

   private String citta;



   @OneToMany
   private List<PostazioniAziendali> postazioniAziendali;

   @ManyToMany
   private List<Utente> utentes;

   public Edificio(String nome, String indirizzo, String citta) {
      this.nome = nome;
      this.indirizzo = indirizzo;
      this.citta = citta;
   }

   public Edificio() {
   }


   @Override
   public String toString() {
      return "Edificio{" +
              "nome='" + nome + '\'' +
              ", indirizzo='" + indirizzo + '\'' +
              ", citta='" + citta + '\'' +
              ", postazioniAziendali=" + postazioniAziendali +
              '}';
   }
}
