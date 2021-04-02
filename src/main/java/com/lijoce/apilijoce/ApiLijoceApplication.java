package com.lijoce.apilijoce;

import com.lijoce.apilijoce.entity.Book;
import com.lijoce.apilijoce.entity.CalcAdv;
import com.lijoce.apilijoce.entity.MountainBike;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
import java.io.*;
import java.util.*;

import java.util.Arrays;
import java.util.function.Function;

@EnableJpaRepositories(basePackages = "com.lijoce.apilijoce.repository")
@SpringBootApplication
public class ApiLijoceApplication extends SpringBootServletInitializer {
    public int StudentAge()
    { // local variable age
        int age = 0;
        age = age + 5;
        return age;
    }
    public static void main(String[] args) {
        SpringApplication.run(ApiLijoceApplication.class, args);
        MountainBike mb = new MountainBike(3, 50, 90);
        System.out.println("xxxxxxxxx" + mb.toString());

        CalcAdv result = new CalcAdv();
        int reslt1 = result.add(20, 10);
        int reslt2 = result.sub(20, 10);

        System.out.println( reslt1+ "xxxxxxxxxxxxxxx" + reslt2);

        // Create the objects of book class.
        Book b1 =  new Book("Music", "roclet");
        Book b2 =  new Book("Music2", "roclet2");
        Book b3 =  new Book("Music3", "roclet3");

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

class Marks {
    int engMarks;
    int mathsMarks;
}


