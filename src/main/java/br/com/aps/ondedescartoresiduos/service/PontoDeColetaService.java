package br.com.aps.ondedescartoresiduos.service;

import br.com.aps.ondedescartoresiduos.entity.PontoDeColeta;
import br.com.aps.ondedescartoresiduos.exceptions.Erros;
import br.com.aps.ondedescartoresiduos.exceptions.ResiduosException;
import br.com.aps.ondedescartoresiduos.repository.PontoDeColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PontoDeColetaService {

    @Autowired
    private PontoDeColetaRepository pontoDeColetaRepository;

    public void savePontoDeColeta(PontoDeColeta ponto){
        pontoDeColetaRepository.save(ponto);
    }

    public void updatePontoDeColeta(PontoDeColeta ponto){
        pontoDeColetaRepository.save(ponto);
    }

//    public Optional<TipoResiduo> findByTipoResiduo(TipoResiduo pontoColeta) throws ResiduosException {
//        var ponto = pontoDeColetaRepository.findByTipoResiduo(pontoColeta);
//        if(ponto == null){
//            throw new ResiduosException(Erros.ERRO_NOTFOUND);
//        }
//
//        return ponto;
//    }

    public List<PontoDeColeta> findByNomeResiduo(String nomeResiduo) {
        return pontoDeColetaRepository.findByResiduoNomeResiduoContains(nomeResiduo);
    }
}
