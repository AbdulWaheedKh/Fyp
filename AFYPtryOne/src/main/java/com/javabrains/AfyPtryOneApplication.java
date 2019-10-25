package com.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication(scanBasePackages={"com.javabrains", "com.javabrains.models","com.javabrains.controller"},
exclude={DataSourceAutoConfiguration.class,
		 DataSourceTransactionManagerAutoConfiguration.class})

public class AfyPtryOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfyPtryOneApplication.class, args);
	}

}
