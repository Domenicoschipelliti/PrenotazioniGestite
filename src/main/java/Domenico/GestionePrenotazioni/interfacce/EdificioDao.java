package Domenico.GestionePrenotazioni.interfacce;

import Domenico.GestionePrenotazioni.enteties.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDao extends JpaRepository<Edificio,String> {
}
