package com.fiap.mottu_patio.config;

import com.fiap.mottu_patio.model.Patio;
import com.fiap.mottu_patio.repository.PatioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Insert {

    @Bean
    CommandLineRunner initDatabase(PatioRepository patioRepository) {
        return args -> {
            if (patioRepository.count() == 0) {
                patioRepository.save(new Patio(null, "Pátio Zona Norte", "Rua das Palmeiras, 123", 50, 50));
                patioRepository.save(new Patio(null, "Pátio Central", "Avenida Brasil, 987", 75, 75));
                patioRepository.save(new Patio(null, "Pátio Sul", "Rua do Comércio, 456", 100, 100));
                patioRepository.save(new Patio(null, "Pátio Leste", "Alameda Santos, 234", 80, 80));
                patioRepository.save(new Patio(null, "Pátio Oeste", "Travessa das Rosas, 789", 60, 60));

                System.out.println("✅ 5 pátios inseridos com sucesso no banco de dados!");
            }
        };
    }
}
