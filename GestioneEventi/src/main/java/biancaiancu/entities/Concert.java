package biancaiancu.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Concert extends Evento{
    private Genere genere;
    private Boolean inStreaming;

    public Concert() {
    }

    public Concert(String titolo, String descrizione, LocalDate dataEvento, tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Genere genere, Boolean inStreaming) {
        super(titolo, descrizione, dataEvento, tipoEvento, numeroMassimoPartecipanti, location);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

}
