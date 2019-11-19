package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.model.Publication;

@Service
public interface ServicePublication {
    public Publication savePublication(Publication publication, ChercheurBean chercheurBean);
}
