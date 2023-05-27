package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam = new Student(
                   "Mariam",
                   "example@gmail.com",
                   LocalDate.of(2000, JANUARY, 23)
           );
            Student alex = new Student(
                    "Alex",
                    "example2@gmail.com",
                    LocalDate.of(2004, FEBRUARY, 2)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
