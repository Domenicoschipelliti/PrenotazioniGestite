package Domenico.GestionePrenotazioni.DAO;

import Domenico.GestionePrenotazioni.enteties.Edificio;
import Domenico.GestionePrenotazioni.interfacce.EdificioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificoService {

    @Autowired
    EdificioDao edificioDao;

    public void saveEdificio(Edificio edificio){
        edificioDao.save(edificio);
        System.out.println("edifico visto");
    }
}
