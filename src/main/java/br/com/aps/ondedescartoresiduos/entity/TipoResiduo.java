package br.com.aps.ondedescartoresiduos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tipo_residuo")
public class TipoResiduo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_tipo", nullable = false, unique = true)
    private String nomeTipo;

    public TipoResiduo() {
    }

    //construtores
    public TipoResiduo(String nomeTipo){
        this.nomeTipo = nomeTipo;
    }

    public Integer getId() {
        return id;
    }

    // getters and setters
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
}
