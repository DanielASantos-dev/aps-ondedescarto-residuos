package br.com.aps.ondedescartoresiduos.dto.responses;

import java.util.List;

public class ResiduoResponse {

    private Integer id;
    private String tipoNome;
    private String nome;
    private List<PontoDeColetaResponse> pontosDeColetaResponse;


    public ResiduoResponse(){}

    public ResiduoResponse(Integer id, String nome, String tipoNome, List<PontoDeColetaResponse> pontosDeColetaResponse) {
        this.id = id;
        this.tipoNome = tipoNome;
        this.nome = nome;
        this.pontosDeColetaResponse = pontosDeColetaResponse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoNome() {
        return tipoNome;
    }

    public void setTipoNome(String tipoNome) {
        this.tipoNome = tipoNome;
    }

    public List<PontoDeColetaResponse> getPontosDeColetaResponse() {
        return pontosDeColetaResponse;
    }

    public void setPontosDeColetaResponse(List<PontoDeColetaResponse> pontosDeColetaResponse) {
        this.pontosDeColetaResponse = pontosDeColetaResponse;
    }
}

