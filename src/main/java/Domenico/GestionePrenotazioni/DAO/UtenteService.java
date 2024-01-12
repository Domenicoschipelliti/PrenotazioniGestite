package Domenico.GestionePrenotazioni.DAO;

import Domenico.GestionePrenotazioni.enteties.Utente;
import Domenico.GestionePrenotazioni.interfacce.UtenteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    @Autowired
    UtenteDao utenteDao;

    public void saveUtente(Utente utente){
        utenteDao.save(utente);
        System.out.println("utente ha prenotato la postazione");
    }
}
