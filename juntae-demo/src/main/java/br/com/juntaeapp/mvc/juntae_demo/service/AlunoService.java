package br.com.juntaeapp.mvc.juntae_demo.service;

import br.com.juntaeapp.mvc.juntae_demo.model.Aluno;
import br.com.juntaeapp.mvc.juntae_demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public void cadastrar(Aluno novoCliente) {

        if (novoCliente == null) return;

        repository.save(novoCliente);

    }

}
