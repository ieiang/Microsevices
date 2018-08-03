package me.ieiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicesEurekaServer1111Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesEurekaServer1111Application.class, args);
    }
}
