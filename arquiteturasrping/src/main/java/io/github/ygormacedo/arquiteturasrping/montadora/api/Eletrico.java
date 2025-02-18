package io.github.ygormacedo.arquiteturasrping.montadora.api;


import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE,ElementType.METHOD})
@Qualifier("motorEletrico")
public @interface Eletrico {
}
