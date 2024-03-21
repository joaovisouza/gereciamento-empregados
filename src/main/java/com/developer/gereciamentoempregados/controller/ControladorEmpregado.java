package com.developer.gereciamentoempregados.controller;

import com.developer.gereciamentoempregados.entity.EntidadeEmpregado;
import com.developer.gereciamentoempregados.service.ServicoEmpregado;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empregados")
public class ControladorEmpregado {

    private final ServicoEmpregado servicoEmpregado;

    public ControladorEmpregado(ServicoEmpregado servicoEmpregado) {
        this.servicoEmpregado = servicoEmpregado;
    }

    @GetMapping
    public List<EntidadeEmpregado> encontrarTodosEmpregados(){
        return servicoEmpregado.encontrarTodosEmpregados();
    }

    @GetMapping("/{id}")
    public Optional<EntidadeEmpregado> encontrarEmpregadoId(@PathVariable("id") Long id){
        return servicoEmpregado.encontrarPorId(id);
    }

    @PostMapping
    public EntidadeEmpregado salvarEmpregado(@RequestBody EntidadeEmpregado entidadeEmpregado){
        return servicoEmpregado.salvarEmpregado(entidadeEmpregado);
    }

    @PutMapping
    public EntidadeEmpregado atualizarEmpregado(@RequestBody EntidadeEmpregado entidadeEmpregado){
        return servicoEmpregado.atualizarEmpregado(entidadeEmpregado);
    }

    @DeleteMapping("/{id}")
    public void deletarEmpregado(@PathVariable("id") Long id){
        servicoEmpregado.deletarEmpregado(id);
    }


}
