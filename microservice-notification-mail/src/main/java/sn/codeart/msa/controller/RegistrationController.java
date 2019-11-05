//package sn.codeart.msa.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailException;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import sn.codeart.msa.beans.ChercheurBean;
//import sn.codeart.msa.model.User;
//import sn.codeart.msa.service.MailService;
//
//import java.util.List;
//
//@RestController
//public class RegistrationController {
//    @Autowired
//    private MailService notificationService;
//
//    @Autowired
//    private User user;
//
//    /**
//     *
//     * @return
//     */
//    @RequestMapping(value = "/send-mail")
//    public String send(List<ChercheurBean> chercheurBeanList) {
//        int nbre = 0;
//        /*
//         * Creating a User with the help of User class that we have declared and setting
//         * Email address of the sender.
//         */
//        for (ChercheurBean chercheurBean : chercheurBeanList ){
//            try{
//                notificationService.sendEmail(chercheurBean);
//                nbre++;
//            }catch (MailException mailException){
//                System.out.println(mailException);
//                return "Envoie de mail pour l'utilisateur "+chercheurBean.getEmail()+" a échoué";
//            }
//
//        }
//        return "Congratulations! "+nbre+" mails have been send to the chercheurs.";
//
//    }
//}
