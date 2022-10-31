package br.com.aps.ondedescartoresiduos.entity;

import javax.persistence.*;

@Entity
@Table(name = "residuos")
public class Residuo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_residuo", nullable = false, unique = true)
    private String nomeResiduo;

    @ManyToOne
    @JoinColumn(name = "tipo_residuo_id")
    private TipoResiduo tipo;

    public Residuo() {
    }

    public Residuo(String nomeResiduo, TipoResiduo tipo){
        this.nomeResiduo = nomeResiduo;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeResiduo() {
        return nomeResiduo;
    }

    public void setNomeResiduo(String nomeResiduo) {
        this.nomeResiduo = nomeResiduo;
    }

    public TipoResiduo getTipo() {
        return tipo;
    }

    public void setTipo(TipoResiduo tipo) {
        this.tipo = tipo;
    }
}
