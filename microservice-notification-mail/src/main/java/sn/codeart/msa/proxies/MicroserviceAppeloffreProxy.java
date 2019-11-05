package sn.codeart.msa.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sn.codeart.msa.beans.AppeloffreBean;

@Service
@FeignClient(name = "microservice-appeloffre", url = "localhost:9002")
public interface MicroserviceAppeloffreProxy {

    @GetMapping(value = "/appeloffres/{idAO}")
    public AppeloffreBean findAppeloffreByIdAO(@PathVariable("idAO") int idAO);
}
