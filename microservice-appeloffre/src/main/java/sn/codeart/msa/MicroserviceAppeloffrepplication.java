package sn.codeart.msa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.core.KafkaTemplate;
@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
public class MicroserviceAppeloffrepplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAppeloffrepplication.class, args);
    }

}
