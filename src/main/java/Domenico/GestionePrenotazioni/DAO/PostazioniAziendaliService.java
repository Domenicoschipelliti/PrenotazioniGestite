package Domenico.GestionePrenotazioni.DAO;

import Domenico.GestionePrenotazioni.enteties.PostazioniAziendali;
import Domenico.GestionePrenotazioni.interfacce.PostazioniAzinedaliDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioniAziendaliService {
    @Autowired
    PostazioniAzinedaliDao postazioniAzinedaliDao;

    public void savePostazioni(PostazioniAziendali postazioniAziendali){
        postazioniAzinedaliDao.save(postazioniAziendali);
        System.out.println("postazione acquisita");
    }
}
