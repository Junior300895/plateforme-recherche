package sn.codeart.msa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import sn.codeart.msa.beans.FonctionBean;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.proxies.MicroserviceInfoProxy;

@EnableFeignClients("sn.codeart.msa")
@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
public class MicroserviceChercheurApplication implements CommandLineRunner {

    @Autowired
    private MicroserviceInfoProxy microserviceInfoProxy;
    @Autowired
    private ChercheurRepository chercheurRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceChercheurApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Chercheur chercheur = chercheurRepository.findChercheurByIdChercheur(1);
        FonctionBean fonctionBean = microserviceInfoProxy.findFonctionByIdFonction(chercheur.getId_fonction());
        System.out.println("Fonction : "+fonctionBean.toString());
    }
}
