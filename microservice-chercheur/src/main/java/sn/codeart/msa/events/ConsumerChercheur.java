//package sn.codeart.msa.events;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//@Service
//public class ConsumerChercheur {
//    private final Logger logger = LoggerFactory.getLogger(ConsumerChercheur.class);
//
//    @Autowired
//    private final ObjectMapper mapper = new ObjectMapper();
//
//    @KafkaListener(topics = "userss", groupId = "group_id")
//    public void consume(String message) throws IOException {
//        logger.info(String.format("#### -> Consumed message -> %s", message));
//    }
//}
