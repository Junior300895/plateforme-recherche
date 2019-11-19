package sn.codeart.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient
@SpringBootApplication
public class ClientUIApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUIApplication.class, args);
    }

}