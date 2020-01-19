package sn.codeart.msa;

import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import sn.codeart.msa.model.AppRole;
import sn.codeart.msa.service.AccountService;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@EnableZuulProxy
@EnableConfigurationProperties
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
//    @Bean
//    CommandLineRunner start(AccountService accountService){
//        return args->{
//            accountService.save(new AppRole(null,"USER"));
//            accountService.save(new AppRole(null,"ADMIN"));
//            accountService.save(new AppRole(null,"AUTHOR"));
//            Stream.of("user1@gmail.com","user2@gmail.com",
//                    "user3@gmail.com","admin@gmail.com").forEach(un->{
//                accountService.saveUser(un,"1234","1234");
//            });
//            //accountService.addRoleToUser("admin@gmail.com","ADMIN");
//        };
//    }
     @Bean
     public BCryptPasswordEncoder passwordEncoder() {
         return new BCryptPasswordEncoder();
     }
}
