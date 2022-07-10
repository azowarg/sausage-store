package com.yandex.practicum.devops;

import com.yandex.practicum.devops.model.Product;
import com.yandex.practicum.devops.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SausageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SausageApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Сливочная", 320.00, "https://storage.yandexcloud.net/yan-bodriyevskiy/sausage-store/%D0%95%D0%B2%D1%80%D0%B5%D0%B9%D1%81%D0%BA%D0%B0%D1%8F.jpeg"));
            productService.save(new Product(2L, "Особая", 179.00, "https://storage.yandexcloud.net/yan-bodriyevskiy/sausage-store/%D0%9C%D0%BE%D0%BB%D0%BE%D1%87%D0%BD%D0%B0%D1%8F.jpeg"));
            productService.save(new Product(3L, "Молочная", 225.00, "https://storage.yandexcloud.net/yan-bodriyevskiy/sausage-store/%D0%9C%D1%8E%D0%BD%D1%85%D0%B5%D0%BD%D1%81%D0%BA%D0%B0%D1%8F.jpeg"));
            productService.save(new Product(4L, "Нюренбергская", 315.00, "https://storage.yandexcloud.net/yan-bodriyevskiy/sausage-store/%D0%9D%D1%8E%D1%80%D0%B5%D0%BD%D0%B1%D0%B5%D1%80%D0%B3%D1%81%D0%BA%D0%B0%D1%8F.jpeg"));
            productService.save(new Product(5L, "Мюнхенская", 330.00, "https://storage.yandexcloud.net/yan-bodriyevskiy/sausage-store/%D0%9E%D1%81%D0%BE%D0%B1%D0%B0%D1%8F.jpeg"));
            productService.save(new Product(6L, "Еврейская", 189.00, "https://storage.yandexcloud.net/yan-bodriyevskiy/sausage-store/%D0%A1%D0%BB%D0%B8%D0%B2%D0%BE%D1%87%D0%BD%D0%B0%D1%8F.jpeg"));
        };
    }
}
