package com.example.notebook.autoconfiguration;

import com.example.notebook.entity.Notebook;
import com.example.notebook.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;

@Configuration
@ConditionalOnProperty(prefix = "custom.configuration", name = "enabled", havingValue = "true")
public class HomeAutoconfiguration {

    NotebookService notebookService;

    @Autowired
    public HomeAutoconfiguration(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @Bean
    public void homeConfigurationBean() {
        notebookService.create(new Notebook("Sony Vaio", "China", "Intel-core-i3", 16, true, "steel", BigInteger.valueOf(400)));
        notebookService.create(new Notebook("Ascer", "China", "Intel-core-i5", 32, false, "steel", BigInteger.valueOf(500)));
        notebookService.create(new Notebook("MacBook Pro", "USA", "Apple-M1", 32, false, "steel", BigInteger.valueOf(2200)));
        notebookService.create(new Notebook("Dell", "China", "Intel-core-i7", 64, true, "steel", BigInteger.valueOf(700)));
        notebookService.create(new Notebook("Dell", "China", "Intel-core-i7", 64, true, "plastic", BigInteger.valueOf(700)));
        notebookService.create(new Notebook("Ascer Aspire 5", "USA", "Apple-M1", 8, false, "steel", BigInteger.valueOf(1000)));
        notebookService.create(new Notebook("Apple MacBook Air", "China", "Intel-core-i3", 16, true, "steel", BigInteger.valueOf(400)));
        notebookService.create(new Notebook("Lenovo", "China", "AMD-Dual-core A4", 32, false, "plastic", BigInteger.valueOf(200)));
        notebookService.create(new Notebook("HP", "Taiwan", "AMD Ryzen 7", 16, false, "steel", BigInteger.valueOf(600)));
        notebookService.create(new Notebook("Acer Nitro", "Taiwan", "Intel-core-i5", 32, false, "steel", BigInteger.valueOf(700)));
        notebookService.create(new Notebook("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16, true, "steel", BigInteger.valueOf(400)));
        notebookService.create(new Notebook("Asus VivoBook", "China", "Intel core-i5", 8, false, "steel", BigInteger.valueOf(500)));
        notebookService.create(new Notebook("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16, true, "steel", BigInteger.valueOf(400)));
        notebookService.create(new Notebook("MacBook Pro", "USA", "Apple-M1", 32, false, "steel", BigInteger.valueOf(2200)));
        notebookService.create(new Notebook("Acer Nitro", "Taiwan", "Intel core-i5", 32, false, "steel", BigInteger.valueOf(700)));
        notebookService.create(new Notebook("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16, true, "steel", BigInteger.valueOf(400)));
        notebookService.create(new Notebook("Asus VivoBook", "China", "Intel core-i5", 8, false, "steel", BigInteger.valueOf(500)));
        notebookService.create(new Notebook("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16, false, "steel", BigInteger.valueOf(400)));
        notebookService.create(new Notebook("Asus VivoBook", "China", "Intel core-i5", 8, false, "steel", BigInteger.valueOf(500)));
        notebookService.create(new Notebook("MacBook Pro", "USA", "Apple-M1", 32, false, "steel", BigInteger.valueOf(2220)));
        notebookService.create(new Notebook("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16, false, "steel", BigInteger.valueOf(400)));

    }
}
