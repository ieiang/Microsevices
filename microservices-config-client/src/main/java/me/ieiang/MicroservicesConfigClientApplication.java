package me.ieiang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@RefreshScope
@SpringBootApplication
public class MicroservicesConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @GetMapping("/hi")
    public String hi() {
        return foo;
    }
}
