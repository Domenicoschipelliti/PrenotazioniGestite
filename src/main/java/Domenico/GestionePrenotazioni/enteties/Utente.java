package Domenico.GestionePrenotazioni.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Utente {
    private String userName;

    private String nomeCompleto;

    private String email;

    @ManyToOne
    private List<PostazioniAziendali> postazioniAziendali;

    public Utente(String userName, String nomeCompleto, String email) {
        this.userName = userName;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public Utente(){

    }

}
