package biancaiancu.entities;

import javax.persistence.*;

@Entity
@Table(name="partecipazione")
public class Partecipazione {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="persona")
    private String persona;
    @Column(name="evento")
private String evento;
    @Enumerated(EnumType.STRING)
    @Column(name="stato")
    private StatoPartecipazione stato;

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatoPartecipazione getStato() {
        return stato;
    }

    public void setStato(StatoPartecipazione stato) {
        this.stato = stato;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Partecipazione(int id,String evento,String persona) {
        this.id = id;
        this.evento=evento;
        this.persona=persona;
    }
}
