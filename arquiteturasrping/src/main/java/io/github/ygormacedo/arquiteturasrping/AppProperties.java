package io.github.ygormacedo.arquiteturasrping;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppProperties {


    private Integer valor3;
    private String falador;


    public Integer getValor3() {
        return valor3;
    }

    public void setValor3(Integer valor3) {
        this.valor3 = valor3;
    }

    public String getFalador() {
        return falador;
    }

    public void setFalador(String falador) {
        this.falador = falador;
    }
}
