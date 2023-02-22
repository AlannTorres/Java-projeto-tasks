package br.com.desafio.tasks.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends CrudRepository<Tarefa, Long> {
    List<Tarefa> findByStatusEquals(EnumStatus status);
}
