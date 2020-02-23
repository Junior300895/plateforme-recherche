package sn.codeart.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableConfigurationProperties
@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceStructureApplication.class, args);
    }

}
