package io.github.ygormacedo.arquiteturasrping;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder =
				new SpringApplicationBuilder(Application.class);

		builder.bannerMode(Banner.Mode.OFF);

		builder.profiles("producao");

		builder.run(args);

		//contexto da aplicacao ja iniciada::

		ConfigurableApplicationContext appliationContext = builder.context();
		// var produtoRepository = appliationContext.getBean("ProdutoRepository");

		ConfigurableEnvironment environment = appliationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("nome da aplicao" + applicationName);

		// builder.profiles("producao"); // para subir pra producao

		// builder.properties("spring.datasource.url=jdbc://");

	}

}