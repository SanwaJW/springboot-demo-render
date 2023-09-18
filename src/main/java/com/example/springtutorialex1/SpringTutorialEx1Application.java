package com.example.springtutorialex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTutorialEx1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringTutorialEx1Application.class, args);

//        System.out.println(Objects.isNull("hhh"));
        System.out.println("".isEmpty());
    }


}
