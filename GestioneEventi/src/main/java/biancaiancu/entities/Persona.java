package biancaiancu.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="nome")
    private String nome;

    @Column(name="cognome")
    private String cognome;

    @Column(name="email")
    private String email;

    @Column(name="dataNascita")
    private LocalDate dataNascita;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)


    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona(int id,String nome,String cognome,String email,LocalDate dataNascita,Sesso sesso) {
        this.cognome=cognome;
        this.nome=nome;
        this.email=email;
        this.id=id;
        this.sesso=sesso;
        this.dataNascita=dataNascita;
    }
}
