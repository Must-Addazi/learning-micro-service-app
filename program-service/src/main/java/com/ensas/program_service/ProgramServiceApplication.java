package com.ensas.program_service;

import com.ensas.program_service.entities.Program;
import com.ensas.program_service.repositories.ProgramRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class ProgramServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramServiceApplication.class, args);
	}
@Bean
	CommandLineRunner commandLineRunner(ProgramRepository programRepository){
		return args -> {
			programRepository.save(Program.builder().id(UUID.randomUUID().toString()).name("WEB").responsibleName("Must").ResponsibleEmail("must@Gmail.com").build());
			programRepository.save(Program.builder().id(UUID.randomUUID().toString()).name(".NET").responsibleName("Must2").ResponsibleEmail("must2@Gmail.com").build());
			programRepository.save(Program.builder().id(UUID.randomUUID().toString()).name("Java").responsibleName("Must3").ResponsibleEmail("must3@Gmail.com").build());

		};
	}

}
