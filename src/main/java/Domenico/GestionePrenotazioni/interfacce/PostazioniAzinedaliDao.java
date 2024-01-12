package Domenico.GestionePrenotazioni.interfacce;

import Domenico.GestionePrenotazioni.enteties.PostazioniAziendali;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioniAzinedaliDao extends JpaRepository<PostazioniAziendali,Long> {
}
