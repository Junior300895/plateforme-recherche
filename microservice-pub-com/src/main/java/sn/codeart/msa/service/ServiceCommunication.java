package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.model.Communication;

@Service
public interface ServiceCommunication {
    public Communication savePublication(Communication publication, ChercheurBean chercheurBean);
}
