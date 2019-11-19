//package sn.codeart.msa.events;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//import sn.codeart.msa.dao.ChercheurRepository;
//import sn.codeart.msa.dao.ThematiqueAppeloffreRepository;
//import sn.codeart.msa.dao.ThematiqueRepository;
//import sn.codeart.msa.model.AppeloffreThematique;
//import sn.codeart.msa.model.Chercheur;
//import sn.codeart.msa.model.Thematique;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class AppeloffreThematiqueKafkaListener {
//    private final Logger logger = LoggerFactory.getLogger(AppeloffreThematiqueKafkaListener.class);
//
//    @Autowired
//    private final ObjectMapper mapper = new ObjectMapper();
//    @Autowired
//    private ThematiqueAppeloffreRepository thematiqueAppeloffreRepository;
//    @Autowired
//    private ThematiqueRepository thematiqueRepository;
//    @Autowired
//    private ChercheurRepository chercheurRepository;
//
//    AppeloffreThematique appeloffreThematique = new AppeloffreThematique();
//
//    @KafkaListener(topics = "ao-th", groupId = "group_id")
//    public void consume(AppeloffreThematique appeloffreThematique) throws IOException {
//        this.appeloffreThematique.setIdAppeloffre(appeloffreThematique.getIdAppeloffre());
//        this.appeloffreThematique.setIdThematique(appeloffreThematique.getIdThematique());
//
//        this.appeloffreThematique = thematiqueAppeloffreRepository.save(appeloffreThematique);
//        logger.info(String.format("#### -> Consumed message -> %s", this.appeloffreThematique.toString()));
//
//        Thematique thematique = thematiqueRepository.
//                findThematiqueByIdThematique(appeloffreThematique.getIdThematique());
//        List<Chercheur> chercheurList = chercheurRepository.findChercheursByThematiques(thematique);
//        for (Chercheur chercheur : chercheurList) {
//            logger.info("Email==> " + chercheur.getEmail());
//        }
//    }
//}
