package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.dao.PublicationRepository;
import sn.codeart.msa.model.Publication;
import sn.codeart.msa.service.ServicePublication;

@Service
public class ServicePublicationImpl implements ServicePublication {
    @Autowired
    private PublicationRepository publicationRepository;
    @Override
    public Publication savePublication(Publication publication, ChercheurBean chercheurBean) {
        publication.setIdChercheur(chercheurBean.getIdChercheur());
        publication.setAuteur(chercheurBean.getPrenom()+" "+chercheurBean.getNom());
        return publicationRepository.save(publication);
    }
}
