package io.github.ygormacedo.arquiteturasrping;

import io.github.ygormacedo.arquiteturasrping.todos.MailSender;
import io.github.ygormacedo.arquiteturasrping.todos.TodoRepository;
import io.github.ygormacedo.arquiteturasrping.todos.TodoService;
import io.github.ygormacedo.arquiteturasrping.todos.TodoValidator;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.parsing.BeanEntry;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.DriverManager;

public class ExemploInjecaoDependencia {

    public static void main(String[] args) throws Exception{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();
        EntityManager entityManager = null;

        TodoRepository repository = null;
        TodoValidator todoValidator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService todoService = new TodoService(repository,todoValidator,sender);



//        BeanGerenciado beanGerenciado = BeanGerenciado(null);
//        BeanGerenciado.setValidator(todoValidator);
//        if (codicao == true){
//            beanGerenciado.setValidator();
//        }

    }

}
