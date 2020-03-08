//package sn.codeart.msa;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import sn.codeart.msa.model.AppRole;
//import sn.codeart.msa.model.AppUser;
//import sn.codeart.msa.service.AccountService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootTest
//class ZuulServerApplicationTests {
//
//    @Autowired
//    private AccountService accountService;
//    @Test
//    void contextLoads() {
//        accountService.save(new AppRole(null,"USER"));
//        accountService.save(new AppRole(null,"ADMIN"));
//        accountService.save(new AppRole(null,"AUTHOR"));
//
//        AppUser appUser1 = new AppUser();
//        appUser1.setPrenom("Alioune Bada");
//        appUser1.setNom("NDOYE");
//        appUser1.setMail("admin@gmail.com");
//        appUser1.setPassword("1234");
//        List<String> roles = new ArrayList<>();
//        roles.add("ADMIN");
//        roles.add("AUTHOR");
//        appUser1 = accountService.saveUser(appUser1, roles);
//        Assert.assertEquals("test insertion user 1","admin@gmail.com", appUser1.getMail());
//    }
//
//}
