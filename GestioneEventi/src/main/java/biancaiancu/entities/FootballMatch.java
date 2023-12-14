package biancaiancu.entities;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import java.time.LocalDate;

@Entity
@NamedQuery(name = "findTiedGames", query = "SELECT m FROM FootballMatch m WHERE m.squadraVincente IS NULL")
@NamedQuery(name = "findHomeWinners", query = "SELECT m FROM FootballMatch m WHERE m.squadraVincente=m.squadraDiCasa")
@NamedQuery(name = "findAwayWinners", query = "SELECT m FROM FootballMatch m WHERE m.squadraVincente=m.squadraOspite")
public class FootballMatch extends Evento {
    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int golSquadraDiCasa;
    private int golSquadraOspite;

    public FootballMatch(String titolo, String descrizione, LocalDate dataEvento, tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, int golSquadraDiCasa, int golSquadraOspite) {
        super(titolo, descrizione, dataEvento, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.golSquadraDiCasa = golSquadraDiCasa;
        this.golSquadraOspite = golSquadraOspite;
    }

    public FootballMatch() {
        super();
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolSquadraDiCasa() {
        return golSquadraDiCasa;
    }

    public void setGolSquadraDiCasa(int golSquadraDiCasa) {
        this.golSquadraDiCasa = golSquadraDiCasa;
    }

    public int getGolSquadraOspite() {
        return golSquadraOspite;
    }

    public void setGolSquadraOspite(int golSquadraOspite) {
        this.golSquadraOspite = golSquadraOspite;
    }
}
