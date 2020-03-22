package sn.codeart.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import sn.codeart.msa.service.FileStorageProperties;

@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class MicroserviceNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceNotificationApplication.class, args);
    }
}
