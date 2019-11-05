package sn.codeart.msa.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.beans.ThematiqueBean;

import java.util.List;

@Service
@FeignClient(name = "microservice-chercheur", url = "localhost:9001")
public interface MicroserviceChercheurProxy {

    @GetMapping(value = "/chercheursByThematique/{idTh}")
    List<ChercheurBean> findChercheursByThematiques(@PathVariable("idTh") int idTh);
}
