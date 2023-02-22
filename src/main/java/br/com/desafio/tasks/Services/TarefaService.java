package br.com.desafio.tasks.Services;

import br.com.desafio.tasks.Model.EnumStatus;
import br.com.desafio.tasks.Model.Tarefa;
import org.springframework.stereotype.Service;

@Service
public interface TarefaService {
    Iterable<Tarefa> buscarTodos();
    Iterable<Tarefa> buscarPendentes();
    Iterable<Tarefa> buscarConcluidos();
    Tarefa buscarPorId(Long id);
    void inserir(Tarefa tarefa);
    void atualizar(Long id, Tarefa tarefa);
    void deletar(Long id);
    void atualizarStatus(Long id, EnumStatus status);
}
