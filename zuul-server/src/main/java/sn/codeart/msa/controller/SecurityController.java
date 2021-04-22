package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.dao.AppUserRepository;
import sn.codeart.msa.model.AppRole;
import sn.codeart.msa.model.AppUser;
import sn.codeart.msa.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;
import java.util.List;

@CrossOrigin("*")
@RestController
public class SecurityController {
    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/users/{role}")
    public AppUser saveUser(@RequestBody AppUser appUser,@PathVariable("role") List<String> roles){
        return accountService.saveUser(appUser, roles);
    }
    @PutMapping(value = "/users/{email}/{role}")
    public AppUser updateUser(@RequestBody AppUser appUser,@PathVariable("email") String email,
    		@PathVariable("role") List<String> roles){
    	return accountService.updateUser(appUser, email, roles);
    }
    @GetMapping(value = "/users")
    public List<AppUser> findAllUser(){
        return accountService.getUsers();
    }
    @GetMapping(value = "/users/email/{email}")
    public AppUser findAppUserByMail(@PathVariable("email") String email){
        return accountService.getUserByMail(email);
    }
    @DeleteMapping(value = "/users/{email}")
    public AppUser deleteAppUser(@PathVariable("email") String email){
        return accountService.deleteAppUser(email);
    }
    
    
    /**
     * Roles
     */
    @GetMapping(value = "/roles")
    public List<AppRole> findAllRoles(){
        return accountService.getRoles();
    }
}
