package Domenico.GestionePrenotazioni.enteties;

import Domenico.GestionePrenotazioni.DAO.EdificoService;
import Domenico.GestionePrenotazioni.DAO.PostazioniAziendaliService;
import Domenico.GestionePrenotazioni.DAO.UtenteService;
import Domenico.GestionePrenotazioni.Enum.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerRun implements CommandLineRunner {

    @Autowired
    PostazioniAziendaliService postazioniAziendaliService;
    @Autowired
    EdificoService edificoService;
    @Autowired
    UtenteService utenteService;
    @Override
    public void run(String... args) throws Exception {

         System.out.println("DATABASE COLLEGATO");

         PostazioniAziendali postazioniAziendali=new PostazioniAziendali("postazione 8", Tipo.PRIVATO,8);
         Edificio edificio=new Edificio("Constructor SRL","via savona 13","Milano");
         Utente utente=new Utente("dom02","domenico","domenico@gmail.com");

         postazioniAziendaliService.savePostazioni(postazioniAziendali);
         edificoService.saveEdificio(edificio);
         utenteService.saveUtente(utente);


    }
}
