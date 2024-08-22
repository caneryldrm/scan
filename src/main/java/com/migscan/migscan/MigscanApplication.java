package com.migscan.migscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.migscan.migscan.tables.Category;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MigscanApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(MigscanApplication.class, args);
	}
	//sds sss
}
