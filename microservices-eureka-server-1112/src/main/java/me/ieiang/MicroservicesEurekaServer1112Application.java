package me.ieiang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@EnableEurekaServer
@SpringBootApplication
public class MicroservicesEurekaServer1112Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesEurekaServer1112Application.class, args);
    }


}
