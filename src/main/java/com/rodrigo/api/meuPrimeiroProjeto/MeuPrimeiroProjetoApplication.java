package com.rodrigo.api.meuPrimeiroProjeto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {
    
    @Value("${paginacao.quantidade_por_pag}")
    private Integer quantidadePorPag;
    
    public static void main(String[] args) {
        SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner() {
      return args -> {
          System.out.println("Quantidade de elementos por página = " + this.quantidadePorPag);  
      };
    }
}
