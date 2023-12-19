package com.javatechie.jpa;

import com.javatechie.jpa.dto.APIResponse;
import com.javatechie.jpa.entity.Product;
import com.javatechie.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class PaginationSortingExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaginationSortingExampleApplication.class, args);
    }

}
