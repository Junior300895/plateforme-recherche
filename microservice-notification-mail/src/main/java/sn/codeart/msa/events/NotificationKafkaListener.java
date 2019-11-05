package sn.codeart.msa.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.AppeloffreThematique;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.proxies.MicroserviceAppeloffreProxy;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;
import sn.codeart.msa.service.MailService;

import java.io.IOException;
import java.util.List;

@Service
public class NotificationKafkaListener {
    private static final Logger logger = LoggerFactory.getLogger(NotificationKafkaListener.class);

    @Autowired
    private MicroserviceChercheurProxy microserviceChercheurProxy;
    @Autowired
    private MailService mailService;
    @Autowired
    private MicroserviceAppeloffreProxy microserviceAppeloffreProxy;

    @KafkaListener(topics = "notify", groupId = "group_id")
    public void consume(AppeloffreThematique appeloffreThematique) throws IOException {
        logger.info("### Consumer notify ==> "+appeloffreThematique.toString());

        List<ChercheurBean> chercheurList = microserviceChercheurProxy.
                findChercheursByThematiques(appeloffreThematique.getIdThematique());

        this.sendMailToChercheurs(chercheurList, appeloffreThematique.getIdAppeloffre());
    }

    public void sendMailToChercheurs(List<ChercheurBean> chercheurBeanList, int IdAO) {
        int nbre = 0;
        String titre = microserviceAppeloffreProxy.findAppeloffreByIdAO(IdAO).getIntitule();
        /*
         * Creating a User with the help of User class that we have declared and setting
         * Email address of the sender.
         */
        for (ChercheurBean chercheurBean : chercheurBeanList ){
            try{
                mailService.sendEmail(titre, chercheurBean, IdAO);
                logger.info("Notify Email ==> " + chercheurBean.getEmail());
                nbre++;
            }catch (MailException mailException){
                System.out.println(mailException);
                logger.info("Envoie de mail pour l'utilisateur "+chercheurBean.getEmail()+" a échoué");
            }
        }
        logger.info("Congratulations! "+nbre+" mails have been send to the chercheurs.");
    }
}
