package io.github.ygormacedo.arquiteturasrping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    @Value("${app.config.variavel}")
    private String varivavel;

    public void imprimirVariavel(){
        System.out.println(varivavel);

    }

}
