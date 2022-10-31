package br.com.aps.ondedescartoresiduos.repository;

import br.com.aps.ondedescartoresiduos.entity.PontoDeColeta;
import br.com.aps.ondedescartoresiduos.entity.Residuo;
import br.com.aps.ondedescartoresiduos.entity.TipoResiduo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PontoDeColetaRepository extends JpaRepository<PontoDeColeta, Integer> {

    List<PontoDeColeta> findByResiduoNomeResiduoContains(String nomeResiduo);

}
