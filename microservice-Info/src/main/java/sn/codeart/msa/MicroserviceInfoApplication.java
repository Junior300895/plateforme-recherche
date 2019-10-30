package sn.codeart.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
public class MicroserviceInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceInfoApplication.class, args);
    }

}
