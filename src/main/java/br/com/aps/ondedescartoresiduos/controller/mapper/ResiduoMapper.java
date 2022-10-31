package br.com.aps.ondedescartoresiduos.controller.mapper;

import br.com.aps.ondedescartoresiduos.dto.responses.ResiduoResponse;
import br.com.aps.ondedescartoresiduos.entity.PontoDeColeta;
import br.com.aps.ondedescartoresiduos.entity.Residuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResiduoMapper {

    @Autowired
    PontoDeColetaMapper pontoDeColetaMapper;

    public ResiduoResponse ToResiduoResponse(Residuo residuo, List<PontoDeColeta> pontos){
        return new ResiduoResponse(
                residuo.getId(),
                residuo.getNomeResiduo(),
                residuo.getTipo().getNomeTipo(),
                pontoDeColetaMapper.toListPontoDeColetaResponse(pontos)
        );
    }
}
