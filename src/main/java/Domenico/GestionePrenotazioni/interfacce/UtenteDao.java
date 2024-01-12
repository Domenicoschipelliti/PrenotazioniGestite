package Domenico.GestionePrenotazioni.interfacce;

import Domenico.GestionePrenotazioni.Enum.Tipo;
import Domenico.GestionePrenotazioni.enteties.Edificio;
import Domenico.GestionePrenotazioni.enteties.PostazioniAziendali;
import Domenico.GestionePrenotazioni.enteties.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDao extends JpaRepository<Utente,String> {

    //PostazioniAziendali findByTipo(Tipo tipo);

    //Edificio findByCitta(String citta);
}
