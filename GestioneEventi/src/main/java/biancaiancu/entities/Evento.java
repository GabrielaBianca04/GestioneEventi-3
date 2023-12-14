package biancaiancu.entities;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="evento")
public class Evento {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="titolo")
    private String titolo;
    @Column(name="dataEvento")
    private LocalDate dataEvento;
    @Column(name="descrizione")
    private String descrizione;
    @Enumerated (EnumType.STRING)
    @Column(name="tipoEvento")
    private tipoEvento tipoEvento;
    @Column(name="numeroMassimoPartecipanti")
    private int numeroMassimoPartecipanti;

    public Evento() {

    }

    public Evento(String titolo, String descrizione, LocalDate dataEvento, tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location) {
    }

    @OneToOne(mappedBy = "evento")
    @OneToMany(mappedBy = "evento")


    public int getId() {
        return id;
    }
    public String getTitolo() {
        return titolo;
    }
    public LocalDate getDataEvento() {
        return dataEvento;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public tipoEvento getTipoEvento() {
        return tipoEvento;
    }
    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setTipoEvento(tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }



    public Evento(String titolo,LocalDate dataEvento) {
        this.titolo=titolo;
        this.dataEvento=dataEvento;
    }


}
