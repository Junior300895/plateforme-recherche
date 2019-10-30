package sn.codeart.msa.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sn.codeart.msa.beans.FonctionBean;
import sn.codeart.msa.beans.GradeBean;
import sn.codeart.msa.beans.StatutBean;

@Component
@FeignClient(name = "microservice-info", url = "localhost:9001")
public interface MicroserviceInfoProxy {

    @GetMapping(value = "/fonction/{libeleCourt}")
    public FonctionBean findFonctionByLibeleCourt(@PathVariable("libeleCourt") String lc);
    @GetMapping(value = "/getfonction/{id}")
    public FonctionBean findFonctionByIdFonction(@PathVariable("id") int id);

    @GetMapping(value = "/grade/{libeleCourt}")
    public GradeBean findGradeByLibeleCourt(@PathVariable("libeleCourt") String lc);

    @GetMapping(value = "/statut/{libeleCourt}")
    public StatutBean findStatutByLibeleCourt(@PathVariable("libeleCourt") String lc);
}
