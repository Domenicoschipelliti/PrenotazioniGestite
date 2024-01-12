package Domenico.GestionePrenotazioni.interfacce;

import Domenico.GestionePrenotazioni.enteties.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDao extends JpaRepository<Utente,String> {
}
