package br.com.aps.ondedescartoresiduos.entity;

import javax.persistence.*;

@Entity
@Table(name = "ponto_coleta")
public class PontoDeColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private String cep;

    private String numero;

    @ManyToOne
    @JoinColumn(name = "tipo_residuo_id")
    private Residuo residuo;


    public PontoDeColeta() {
    }

    public PontoDeColeta(String descricao, String cep, String numero, Residuo residuo) {
        this.descricao = descricao;
        this.cep = cep;
        this.numero = numero;
        this.residuo = residuo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo tipoResiduo) {
        this.residuo = tipoResiduo;
    }


}
