package sn.codeart.msa.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.beans.ThematiqueBean;

@Component
@FeignClient(name = "microservice-chercheur", url = "localhost:9001")
public interface MicroserviceChercheurProxy {

    @GetMapping(value = "/chercheurs/{email}")
    public ChercheurBean findChercheurByEmail(@PathVariable("email") String email);
    @GetMapping(value = "/getThematiqueByLc/{lc}")
    ThematiqueBean findThematiqueByLibeleCourt(@PathVariable("lc") String lc);
}
