# Projeto Tasks

# Sobre o projeto
Projeto feito para o bootcamp Orange Tech da Dio
Este projeto é um exemplo de um aplicativo de gerenciamento de tarefas, criado utilizando a API Rest do Spring Boot. Com este aplicativo, os usuários podem criar, atualizar e excluir tarefas, bem como marcar tarefas como concluídas ou pendentes.

# Pré-requisitos
Antes de começar, você deve ter os seguintes pré-requisitos instalados em sua máquina:
- Java 19
- Maven 4.0.0

# Dependecias Spring usadas:
 - Spring JPA
 - Spring Web 
 - Open Feign 
 - H2 Database
 - Springdoc Openapi

# API Endpoints:
### GET - /tarefa/buscarTodos
Retorna todas as tarefas cadastradas.

### GET - /tarefa/buscarPendentes
Retorna todas as tarefas pendentes cadastradas.

### GET - /tarefa/buscarConcluidos
Retorna todas as tarefas concluidas cadastradas.

### GET - /tarefa/buscarPorId/{id}
Retorna tarefa com base no id.

### POST - /tarefa/inserir
Cria uma nova tarefa.

### PUT - /tarefa/atualizar/{id}
Atualiza uma tarefa existente.

### DELETE - /tarefa/deletar/{id}
Exclui uma tarefa existente.

### PATCH - /tarefa/atualizarStatus/{id}
Atualiza o status de uma tarefa para concluída ou pendente.

# Tecnologias utilizadas 
  - SpringBoot 3.0.2
