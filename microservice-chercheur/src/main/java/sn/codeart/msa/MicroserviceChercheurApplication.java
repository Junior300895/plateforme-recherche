package sn.codeart.msa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableConfigurationProperties
@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
public class MicroserviceChercheurApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceChercheurApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
