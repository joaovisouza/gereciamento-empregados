package com.developer.gereciamentoempregados.service.impl;

import com.developer.gereciamentoempregados.entity.EntidadeEmpregado;
import com.developer.gereciamentoempregados.repository.RepositorioEmpregado;
import com.developer.gereciamentoempregados.service.ServicoEmpregado;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoEmpregadoImpl implements ServicoEmpregado {

    private final RepositorioEmpregado repositorioEmpregado;

    public ServicoEmpregadoImpl(RepositorioEmpregado repositorioEmpregado) {
        this.repositorioEmpregado = repositorioEmpregado;
    }

    @Override
    public List<EntidadeEmpregado> encontrarTodosEmpregados() {
        return repositorioEmpregado.findAll();
    }

    @Override
    public Optional<EntidadeEmpregado> encontrarPorId(Long id) {
        return repositorioEmpregado.findById(id);
    }

    @Override
    public EntidadeEmpregado salvarEmpregado(EntidadeEmpregado entidadeEmpregado) {
        return repositorioEmpregado.save(entidadeEmpregado);
    }

    @Override
    public EntidadeEmpregado atualizarEmpregado(EntidadeEmpregado entidadeEmpregado) {
        return repositorioEmpregado.save(entidadeEmpregado);
    }

    @Override
    public void deletarEmpregado(Long id) {
        repositorioEmpregado.deleteById(id);
    }
}
