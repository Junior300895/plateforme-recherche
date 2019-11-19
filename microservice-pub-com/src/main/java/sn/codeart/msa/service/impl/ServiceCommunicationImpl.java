package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.dao.CommunicationRepository;
import sn.codeart.msa.model.Communication;
import sn.codeart.msa.service.ServiceCommunication;

@Service
public class ServiceCommunicationImpl implements ServiceCommunication {
    @Autowired
    private CommunicationRepository communicationRepository;

    @Override
    public Communication savePublication(Communication communication, ChercheurBean chercheurBean) {
        communication.setIdChercheur(chercheurBean.getIdChercheur());
        communication.setAuteur(chercheurBean.getPrenom()+" "+chercheurBean.getNom());
        return communicationRepository.save(communication);
    }
}
