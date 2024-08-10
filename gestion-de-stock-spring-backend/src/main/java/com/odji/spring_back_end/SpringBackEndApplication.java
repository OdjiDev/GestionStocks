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
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.odji.spring_back_end")
//@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class SpringBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBackEndApplication.class, args);
    }
}
