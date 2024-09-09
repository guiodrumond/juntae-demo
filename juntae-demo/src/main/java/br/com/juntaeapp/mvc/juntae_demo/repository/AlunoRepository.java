package br.com.juntaeapp.mvc.juntae_demo.repository;


import br.com.juntaeapp.mvc.juntae_demo.model.Aluno;
import br.com.juntaeapp.mvc.juntae_demo.model.StatusAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByStatusAluno(StatusAluno statusPedido);
}
