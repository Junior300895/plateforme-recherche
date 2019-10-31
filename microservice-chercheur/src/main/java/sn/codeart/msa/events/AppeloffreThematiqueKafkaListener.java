package sn.codeart.msa.events;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.ThematiqueAppeloffreRepository;
import sn.codeart.msa.model.AppeloffreThematique;

import java.io.IOException;
@Service
public class AppeloffreThematiqueKafkaListener {
    private final Logger logger = LoggerFactory.getLogger(AppeloffreThematiqueKafkaListener.class);

    @Autowired
    private final ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private ThematiqueAppeloffreRepository thematiqueAppeloffreRepository;

    AppeloffreThematique thematiqueAppeloffre = new AppeloffreThematique();
    @KafkaListener(topics = "userss", groupId = "group_id")
    public void consume(AppeloffreThematique thematiqueAppeloffre) throws IOException {
        thematiqueAppeloffre.setId(thematiqueAppeloffre.getId());
        thematiqueAppeloffre.setIdAppeloffre(thematiqueAppeloffre.getIdAppeloffre());
        thematiqueAppeloffre.setIdThematique(thematiqueAppeloffre.getIdThematique());
        thematiqueAppeloffreRepository.save(thematiqueAppeloffre);

        logger.info(String.format("#### -> Consumed message -> %s", thematiqueAppeloffre.toString()));
    }
}
