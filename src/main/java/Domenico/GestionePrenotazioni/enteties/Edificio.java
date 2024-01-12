package Domenico.GestionePrenotazioni.enteties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Edificio {

   private String nome;
   @Id
   private String indirizzo;

   private String citta;

   @OneToOne
   private PostazioniAziendali postazioniAziendali;

   public Edificio(String nome, String indirizzo, String citta) {
      this.nome = nome;
      this.indirizzo = indirizzo;
      this.citta = citta;
   }

   public Edificio() {
   }

   public String getNome() {
      return nome;
   }

   public String getIndirizzo() {
      return indirizzo;
   }

   public String getCitta() {
      return citta;
   }

   public PostazioniAziendali getPostazioniAziendali() {
      return postazioniAziendali;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setIndirizzo(String indirizzo) {
      this.indirizzo = indirizzo;
   }

   public void setCitta(String citta) {
      this.citta = citta;
   }

   public void setPostazioniAziendali(PostazioniAziendali postazioniAziendali) {
      this.postazioniAziendali = postazioniAziendali;
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
