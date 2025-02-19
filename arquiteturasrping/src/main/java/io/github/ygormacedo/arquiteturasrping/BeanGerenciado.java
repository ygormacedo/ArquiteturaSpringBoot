package io.github.ygormacedo.arquiteturasrping;


import io.github.ygormacedo.arquiteturasrping.todos.TodoEntity;
import io.github.ygormacedo.arquiteturasrping.todos.TodoValidator;
import org.apache.catalina.startup.WebAnnotationSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Lazy
@Component
// @Scope("singleton") utilizado para uma aplicacao
@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope("request")
//@Scope("session") esses dois commit sao utilizados para requisicoes web igual o primeiro acima comentando
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    @Autowired
    private AppProperties properties;

    @Autowired
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
        String falador = properties.getFalador();
        Integer valor3 = properties.getValor3();

    }

    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }


}
