package sn.codeart.msa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableConfigurationProperties
@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient
@SpringBootTest
class MicroserviceStructureApplicationTests {

    @Test
    void contextLoads() {
    }

}
