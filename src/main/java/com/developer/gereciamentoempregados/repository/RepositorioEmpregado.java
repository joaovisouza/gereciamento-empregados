package com.developer.gereciamentoempregados.repository;

import com.developer.gereciamentoempregados.entity.EntidadeEmpregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpregado extends JpaRepository<EntidadeEmpregado, Long> {
}
