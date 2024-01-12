package Domenico.GestionePrenotazioni.DAO;

import Domenico.GestionePrenotazioni.Enum.Tipo;
import Domenico.GestionePrenotazioni.enteties.Edificio;
import Domenico.GestionePrenotazioni.enteties.PostazioniAziendali;
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

    //public PostazioniAziendali findByTipo(Tipo tipo){
       // return utenteDao.findByTipo(tipo);
    //}


    //public Edificio findByCitta(String citta){
        //return utenteDao.findByCitta(citta);
    //}


}
