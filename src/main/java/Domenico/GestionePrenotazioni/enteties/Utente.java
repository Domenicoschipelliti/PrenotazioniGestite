package Domenico.GestionePrenotazioni.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Utente {
    @Id
    private String userName;

    private String nomeCompleto;

    private String email;

    @ManyToMany
    private List<Edificio> edificio;

    public Utente(String userName, String nomeCompleto, String email) {
        this.userName = userName;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public Utente(){

    }

    @Override
    public String toString() {
        return "Utente{" +
                "userName='" + userName + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", edificio=" + edificio +
                '}';
    }
}
