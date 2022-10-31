package br.com.aps.ondedescartoresiduos.dto.responses;

import br.com.aps.ondedescartoresiduos.entity.PontoDeColeta;

import java.util.List;
import java.util.function.Function;

public class PontoDeColetaResponse {

    private String descricao;

    private String cep;

    private String numero;

    public PontoDeColetaResponse() {
    }

    public PontoDeColetaResponse(String descricao, String cep, String numero) {
        this.descricao = descricao;
        this.cep = cep;
        this.numero = numero;
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
}
