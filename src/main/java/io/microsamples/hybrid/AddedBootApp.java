package io.microsamples.hybrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"io.microsamples.hybrid"})
public class AddedBootApp {
    public static void main(String[] args) {
        SpringApplication.run(AddedBootApp.class, args);
    }
}
