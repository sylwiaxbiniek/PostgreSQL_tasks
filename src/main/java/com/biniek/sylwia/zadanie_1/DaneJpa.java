package com.biniek.sylwia.zadanie_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DaneJpa {

    private static final Logger log = LoggerFactory.getLogger(DaneJpa.class);

    public static void main(String[] args) {
        SpringApplication.run(DaneJpa.class, args);
    }

    @Bean
    public CommandLineRunner demo(DaneRepo repo){
        return args -> {
            //save few services
            repo.save(new DaneWejsciowe("Abonament za internet", "40.00"));
            repo.save(new DaneWejsciowe("Bezpieczny internet", "9.90"));
            repo.save(new DaneWejsciowe("Telewizja pakiet pelny", "80.00"));
            repo.save(new DaneWejsciowe("GigaNagrywarka", "15.00"));
            repo.save(new DaneWejsciowe("Rabat za internet", "-20.00"));

            log.info("Services found with findAll():");
            log.info("-------------------------------");
            for (DaneWejsciowe uslugi : repo.findAll()) {
                log.info(uslugi.toString());
            }
            log.info("");

            DaneWejsciowe uslugi = repo.findById(1L);
            log.info("Services found with findById(1L):");
            log.info("--------------------------------");
            log.info(uslugi.toString());
            log.info("");

            log.info("Services found with findByNazwaUslugi('Abonament za internet'):");
            log.info("--------------------------------------------");
            repo.findByNazwaUslugi("Abonament za internet").forEach(abonament_za_internet -> {
                log.info(abonament_za_internet.toString());
            });
            // for (DaneWejsciowe abonament_za_internet : repo.findByNazwaUslugi("Abonament za internet")) {
            //  log.info(abonament_za_internet.toString());
            // }
            log.info("");
        };
    }

}
