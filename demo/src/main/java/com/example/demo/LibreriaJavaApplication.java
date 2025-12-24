package com.example.demo;




import com.example.demo.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaJavaApplication implements CommandLineRunner {

    private final Principal principal;

    public LibreriaJavaApplication(Principal principal) {
        this.principal = principal;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibreriaJavaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        principal.mostrarMenu();
    }
}
