package br.com.aps.ondedescartoresiduos.repository;

import br.com.aps.ondedescartoresiduos.entity.Residuo;
import br.com.aps.ondedescartoresiduos.entity.TipoResiduo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResiduosRepository extends JpaRepository<Residuo, Integer> {

    Optional<Residuo> findByNomeResiduoContainsIgnoreCase(String residou);

    Optional<Residuo> findByTipo(TipoResiduo tipo);
}
