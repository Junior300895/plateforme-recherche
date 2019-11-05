//package sn.codeart.msa.events;
//
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//import sn.codeart.msa.beans.ThematiqueBean;
//import sn.codeart.msa.model.Chercheur;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class ProducerNotification {
//    private static final Logger logger = LoggerFactory.getLogger(ProducerNotification.class);
//
//    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
//    @Autowired
//    private KafkaTemplate<String, ThematiqueBean> kafkaTemplate;
//
//    public void sendNotify(ThematiqueBean diffusionBean) {
//        this.kafkaTemplate.send("notify",diffusionBean );
//        logger.info(String.format("#### -> Producing notify -> %s", diffusionBean.toString()));
//    }
//}
