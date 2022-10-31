package br.com.aps.ondedescartoresiduos.controller.mapper;

import br.com.aps.ondedescartoresiduos.dto.responses.PontoDeColetaResponse;
import br.com.aps.ondedescartoresiduos.entity.PontoDeColeta;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PontoDeColetaMapper {

    public PontoDeColetaResponse ToPontoDeColetaResponse(PontoDeColeta ponto){
        return new PontoDeColetaResponse(
                ponto.getDescricao(),
                ponto.getCep(),
                ponto.getNumero()
        );
    }
    public List<PontoDeColetaResponse> toListPontoDeColetaResponse(List<PontoDeColeta> pontos){
        List<PontoDeColetaResponse> pontosResponse = new ArrayList<>();
        pontos.stream().forEach(p -> pontosResponse.add(ToPontoDeColetaResponse(p)));

        return pontosResponse;
    }
}
