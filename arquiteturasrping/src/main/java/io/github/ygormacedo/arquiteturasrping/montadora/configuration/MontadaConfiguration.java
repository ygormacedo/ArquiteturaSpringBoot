package io.github.ygormacedo.arquiteturasrping.montadora.configuration;

import io.github.ygormacedo.arquiteturasrping.montadora.Motor;
import io.github.ygormacedo.arquiteturasrping.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.naming.Name;

@Configuration
public class MontadaConfiguration {

    @Bean(name = "motoAspirado")
    @Primary
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;

    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("BYD SONG PRO PLUS ");
        motor.setLitragem(1.8);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;

    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(240);
        motor.setCilindros(6);
        motor.setModelo("BRAYAN ");
        motor.setLitragem(2.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
