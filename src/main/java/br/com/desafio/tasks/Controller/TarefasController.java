package br.com.desafio.tasks.Controller;

import br.com.desafio.tasks.Model.EnumStatus;
import br.com.desafio.tasks.Services.TarefaService;
import br.com.desafio.tasks.Model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefa")
public class TarefasController {

    @Autowired
    private TarefaService _tarefaService;

    @GetMapping("/buscarTodos")
    public ResponseEntity<Iterable<Tarefa>> buscarTodos() {
        return ResponseEntity.ok(_tarefaService.buscarTodos());
    }

    @GetMapping("/buscarPendentes")
    public ResponseEntity<Iterable<Tarefa>> buscarPendentes() {
        return ResponseEntity.ok(_tarefaService.buscarPendentes());
    }

    @GetMapping("/buscarConcluidos")
    public ResponseEntity<Iterable<Tarefa>> buscarConcluidos() {
        return ResponseEntity.ok(_tarefaService.buscarConcluidos());
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(_tarefaService.buscarPorId(id));
    }

//    @PostMapping("/inserir")
//    public ResponseEntity<Tarefa> inserir(@RequestParam("titulo") String titulo, @RequestParam("descricao") String descricao, @RequestParam("status") EnumStatus status) {
//        Tarefa _tarefa = new Tarefa(titulo, descricao, status);
//        _tarefaService.inserir(_tarefa);
//        return ResponseEntity.ok(_tarefa);
//    }

    @PostMapping("/inserir")
    public ResponseEntity<Tarefa> inserir(@RequestBody Tarefa tarefa) {
        _tarefaService.inserir(tarefa);
        return ResponseEntity.ok(tarefa);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        _tarefaService.atualizar(id, tarefa);
        return ResponseEntity.ok(tarefa);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Tarefa> deletar(@PathVariable Long id) {
        _tarefaService.deletar(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/atualizarStatus/{id}")
    public ResponseEntity<Tarefa> atualizarStatus(@PathVariable Long id, @RequestParam("status") EnumStatus status) {
        _tarefaService.atualizarStatus(id, status);
        return ResponseEntity.ok().build();
    }
}
