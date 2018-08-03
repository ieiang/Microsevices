package me.ieiang.feign;

import me.ieiang.feign.hystrix.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "MS-HELLO-SERVICE",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @GetMapping("/hi")
    String hi(@RequestParam("name") String name);
}
