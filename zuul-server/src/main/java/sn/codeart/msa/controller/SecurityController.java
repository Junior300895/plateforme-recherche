package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.dao.AppUserRepository;
import sn.codeart.msa.model.AppUser;
import sn.codeart.msa.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;
import java.util.List;

//@CrossOrigin
@RestController
public class SecurityController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping(value = "/ressources")
    public String testdentre(){
        return "user identified";
    }

//    @PostMapping("/login")
//    public boolean login(@RequestBody User user) {
//        return
//                user.getUsername().equals("ndoye@gmail.com") && user.getPassword().equals("123");
//    }

    @GetMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }

    @PostMapping(value = "/saveUser/{role}")
    public AppUser saveUser(@RequestBody AppUser appUser,@PathVariable("role") List<String> roles){
        return accountService.saveUser(appUser, roles);
    }
    @GetMapping(value = "/appUsers/users")
    public List<AppUser> findAllUser(){
        return appUserRepository.findAll();
    }
    @GetMapping(value = "/appUsers/{email}")
    public AppUser findAppUserByMail(@PathVariable("email") String email){
        return appUserRepository.findAppUserByMail(email);
    }
}
