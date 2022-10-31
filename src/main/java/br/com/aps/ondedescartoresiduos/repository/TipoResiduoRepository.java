package br.com.aps.ondedescartoresiduos.repository;

import br.com.aps.ondedescartoresiduos.entity.TipoResiduo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipoResiduoRepository extends JpaRepository<TipoResiduo, Integer> {

    Optional<TipoResiduo> findByNomeTipo(String nome);
}
