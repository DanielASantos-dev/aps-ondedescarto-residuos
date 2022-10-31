package br.com.aps.ondedescartoresiduos.service;

import br.com.aps.ondedescartoresiduos.entity.Residuo;
import br.com.aps.ondedescartoresiduos.entity.TipoResiduo;
import br.com.aps.ondedescartoresiduos.exceptions.Erros;
import br.com.aps.ondedescartoresiduos.exceptions.ResiduosException;
import br.com.aps.ondedescartoresiduos.repository.ResiduosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResiduosService {

    @Autowired
    ResiduosRepository residuosRepository;

    public void saveResisuo(Residuo residuo){
        residuosRepository.save(residuo);
    }

    public void updateResisuo(Residuo residuo){
        residuosRepository.save(residuo);
    }

    public Optional<Residuo> findByNomeResiduo(String residuoNome) throws ResiduosException {
        var residuo =  residuosRepository.findByNomeResiduoContainsIgnoreCase(residuoNome);
        if (residuo == null){
            throw new ResiduosException(Erros.ERRO_NOTFOUND);
        }
        return residuo;
    }


    public Optional<Residuo> findByTipo(TipoResiduo tipo) throws ResiduosException {
        var residuo =  residuosRepository.findByTipo(tipo);
        if (residuo == null){
            throw new ResiduosException(Erros.ERRO_NOTFOUND);
        }
        return residuo;
    }

}
