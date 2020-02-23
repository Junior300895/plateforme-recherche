package sn.codeart.msa.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sn.codeart.msa.model.Chercheur;

@Component
@FeignClient(name = "microservice-chercheur", url = "localhost:9001")
public interface MicroserviceChercheurProxy {

    @GetMapping(value = "/chercheurs/{email}")
    Chercheur findChercheurByEmail(@PathVariable("email") String email);
    //public ChercheurBean findChercheurByEmail(@PathVariable("email") String email);

}
