package sn.codeart.msa.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.dao.DiffusionRepository;
import sn.codeart.msa.model.Diffusion;
import sn.codeart.msa.model.User;
import sn.codeart.msa.proxies.MicroserviceAppeloffreProxy;

import java.util.Date;

@Component
public class MailService {
    /*
     * The Spring Framework provides an easy abstraction for sending email by using
     * the JavaMailSender interface, and Spring Boot provides auto-configuration for
     * it as well as a starter module.
     */
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private DiffusionRepository diffusionRepository;

    /**
     * This function is used to send mail without attachment.
     * @param chercheurBean
     * @throws MailException
     */
    public void sendEmail(String titre, ChercheurBean chercheurBean, int idAO) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(chercheurBean.getEmail());
        mail.setSubject("Intitule Appel d'offre :"+titre);
        mail.setText("Veuillez consulter la plateforme de recherche de l'UCAD pour " +
                "télécharger le libelé de l'appel d'offre");
        /*
         * This send() contains an Object of SimpleMailMessage as an Parameter
         */
        javaMailSender.send(mail);
        /**
         * Save Diffusion among idAo and IdChercheur
         */
        Diffusion diffusion = new Diffusion();
        diffusion.setIdAppeloffre(idAO);
        diffusion.setIdChercheur(chercheurBean.getIdChercheur());
        diffusion.setDate(new Date());
        diffusionRepository.save(diffusion);
    }
}
