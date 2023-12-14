package biancaiancu.entities;

import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="nome")
    private String nome;

    @Column(name="città")
    private String città;

    public String getNome() {
        return nome;
    }

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public Location(String nome,String città) {
        this.nome = nome;
        this.città=città;
    }
}
