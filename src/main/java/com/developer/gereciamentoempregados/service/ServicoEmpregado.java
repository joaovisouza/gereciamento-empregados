package com.developer.gereciamentoempregados.service;

import com.developer.gereciamentoempregados.entity.EntidadeEmpregado;

import java.util.List;
import java.util.Optional;

public interface ServicoEmpregado {
    List<EntidadeEmpregado> encontrarTodosEmpregados();
    Optional<EntidadeEmpregado> encontrarPorId(Long id);
    EntidadeEmpregado salvarEmpregado(EntidadeEmpregado entidadeEmpregado);
    EntidadeEmpregado atualizarEmpregado(EntidadeEmpregado entidadeEmpregado);

    void deletarEmpregado(Long id);
}
