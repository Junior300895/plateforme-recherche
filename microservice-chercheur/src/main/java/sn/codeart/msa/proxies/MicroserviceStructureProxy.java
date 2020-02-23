package sn.codeart.msa.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sn.codeart.msa.beans.StructureBean;
import sn.codeart.msa.beans.UniteRechercheBean;

@Component
@FeignClient(name = "microservice-structure", url = "localhost:9005")
public interface MicroserviceStructureProxy {

    @GetMapping(value = "/getStructureByLc/{lc}")
    public StructureBean findStructureByLc(@PathVariable("lc") String lc);

    @GetMapping(value = "/getUniteByLc/{lc}")
    public UniteRechercheBean findUniteByLc(@PathVariable("lc") String lc);

}
