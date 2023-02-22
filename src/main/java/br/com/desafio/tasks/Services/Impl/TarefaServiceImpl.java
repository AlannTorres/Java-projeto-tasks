package br.com.desafio.tasks.Services.Impl;

import br.com.desafio.tasks.Model.EnumStatus;
import br.com.desafio.tasks.Model.Tarefa;
import br.com.desafio.tasks.Model.TarefaRepository;
import br.com.desafio.tasks.Services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    private TarefaRepository _tarefaRepository;

    @Override
    public Iterable<Tarefa> buscarTodos() {
        return _tarefaRepository.findAll();
    }

    @Override
    public Iterable<Tarefa> buscarPendentes() {
        return _tarefaRepository.findByStatusEquals(EnumStatus.Pendente);
    }

    @Override
    public Iterable<Tarefa> buscarConcluidos() {
        return _tarefaRepository.findByStatusEquals(EnumStatus.Concluido);
    }

    @Override
    public Tarefa buscarPorId(Long id) {
        Optional<Tarefa> tarefa = _tarefaRepository.findById(id);
        return tarefa.get();
    }

    @Override
    public void inserir(Tarefa tarefa) {
        _tarefaRepository.save(tarefa);
    }

    @Override
    public void atualizar(Long id, Tarefa tarefa) {
        Optional<Tarefa> tarefaBd = _tarefaRepository.findById(id);
        if (tarefaBd.isPresent()) {

        }
    }

    @Override
    public void deletar(Long id) {
        _tarefaRepository.deleteById(id);
    }

    @Override
    public void atualizarStatus(Long id, EnumStatus status) {
        Tarefa tarefaBd = _tarefaRepository.findById(id).orElseThrow();
        tarefaBd.setStatus(status);
        _tarefaRepository.save(tarefaBd);
    }
}
