package br.com.aps.ondedescartoresiduos.controller;

import br.com.aps.ondedescartoresiduos.controller.mapper.ResiduoMapper;
import br.com.aps.ondedescartoresiduos.dto.responses.ResiduoResponse;
import br.com.aps.ondedescartoresiduos.entity.Residuo;
import br.com.aps.ondedescartoresiduos.entity.TipoResiduo;
import br.com.aps.ondedescartoresiduos.exceptions.ResiduosException;
import br.com.aps.ondedescartoresiduos.repository.ResiduosRepository;
import br.com.aps.ondedescartoresiduos.service.PontoDeColetaService;
import br.com.aps.ondedescartoresiduos.service.ResiduosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/residuos")
public class ResiduoController {

    @Autowired
    private ResiduosService residuosService;
    @Autowired
    PontoDeColetaService pontoDeColetaService;

    @Autowired
    ResiduoMapper residuoMapper;

    @GetMapping("/{nome}")
    public ResiduoResponse findByName(@PathVariable String nome) throws ResiduosException {

        var pontos = pontoDeColetaService.findByNomeResiduo(nome);
        var residuo = residuosService.findByNomeResiduo(nome).orElseThrow();
        return residuoMapper.ToResiduoResponse(residuo, pontos);
    }

}
