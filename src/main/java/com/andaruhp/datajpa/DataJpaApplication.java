package com.andaruhp.datajpa;

import com.andaruhp.datajpa.models.Author;
import com.andaruhp.datajpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository repository
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("Andaru")
                    .lastName("Hymawan")
                    .email("andaru@gmail.com")
                    .age(21)
                    .build();
            repository.save(author);
        };
    }

}
