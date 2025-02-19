package io.github.ygormacedo.arquiteturasrping.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if (existeTodoComEssaDescricao((todo.getDescricao()))){
            throw new IllegalArgumentException("Ja existe um TO-DO om essa descricao");
        }


    }

    private boolean existeTodoComEssaDescricao(String descricao){
        return repository.existsByDescricao(descricao);

    }


}
