package io.github.ygormacedo.arquiteturasrping;

import io.github.ygormacedo.arquiteturasrping.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

    @Bean
    public MailSender mailSender(){
        return null;
    }


}
