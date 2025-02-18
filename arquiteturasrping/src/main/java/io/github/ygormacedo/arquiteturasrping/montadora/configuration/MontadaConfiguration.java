package io.github.ygormacedo.arquiteturasrping.montadora.configuration;

import io.github.ygormacedo.arquiteturasrping.montadora.Motor;
import io.github.ygormacedo.arquiteturasrping.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadaConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

}
