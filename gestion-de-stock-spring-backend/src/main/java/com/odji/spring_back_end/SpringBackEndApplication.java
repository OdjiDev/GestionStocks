package com.odji.spring_back_end;//package com.odji.spring_back_end;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringBackEndApplication {
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(SpringBackEndApplication.class, args);
//    }
//
//}


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.odji.spring_back_end")
public class SpringBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBackEndApplication.class, args);
    }
}
