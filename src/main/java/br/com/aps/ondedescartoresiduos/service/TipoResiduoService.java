package br.com.aps.ondedescartoresiduos.service;

import br.com.aps.ondedescartoresiduos.entity.TipoResiduo;
import br.com.aps.ondedescartoresiduos.exceptions.Erros;
import br.com.aps.ondedescartoresiduos.exceptions.ResiduosException;
import br.com.aps.ondedescartoresiduos.repository.TipoResiduoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoResiduoService {

    @Autowired
    private TipoResiduoRepository tipoResiduoRepository;

    public void saveTipoResiduo(TipoResiduo tipo){
        tipoResiduoRepository.save(tipo);
    }

    public void updateTipoResiduo(TipoResiduo tipo){
        tipoResiduoRepository.save(tipo);
    }

    public Optional<TipoResiduo> findByNomeTipo(String nomeTipo) throws ResiduosException {
        var tipo = tipoResiduoRepository.findByNomeTipo(nomeTipo);

        if(tipo == null){
            throw new ResiduosException(Erros.ERRO_NOTFOUND);
        }
        return tipo;
    }

}
