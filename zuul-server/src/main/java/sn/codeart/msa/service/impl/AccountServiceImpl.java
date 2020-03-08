//package sn.codeart.msa.service.impl;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import sn.codeart.msa.dao.AppRoleRepository;
//import sn.codeart.msa.dao.AppUserRepository;
//import sn.codeart.msa.model.AppRole;
//import sn.codeart.msa.model.AppUser;
//import sn.codeart.msa.security.SecurityConfig1;
//import sn.codeart.msa.service.AccountService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//@Transactional
//public class AccountServiceImpl implements AccountService {
//    private final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);
//
//    private AppUserRepository appUserRepository;
//    private AppRoleRepository appRoleRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    private SecurityConfig1 securityConfig1;
//    public AccountServiceImpl(AppUserRepository appUserRepository, AppRoleRepository appRoleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
//        this.appUserRepository = appUserRepository;
//        this.appRoleRepository = appRoleRepository;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }
//
//    @Override
//    public AppUser saveUser(String mail, String password, String confirmedPassword) {
//        //AppUser  user=appUserRepository.findByUsername(username);
//        AppUser  user=appUserRepository.findAppUserByMail(mail);
//        if(user!=null) throw new RuntimeException("User already exists");
//        if(!password.equals(confirmedPassword)) throw new RuntimeException("Please confirm your password");
//        AppUser appUser=new AppUser();
//        appUser.setPrenom("Alioune Bada");
//        appUser.setNom("Ndoye");
//        appUser.setMail(mail);
//        appUser.setActived(true);
//        appUser.setPassword(bCryptPasswordEncoder.encode(password));
//        appUserRepository.save(appUser);
//        //addRoleToUser(mail,"USER");
//        List<String> roles = new ArrayList<>();
//        roles.add("USER");
//        roles.add("ADMIN");
//        addRolesToUser(mail, roles);
//        return appUser;
//    }
//
//    @Override
//    public AppUser saveUser(AppUser appUser, List<String> roles) {
//        AppUser  user=appUserRepository.findAppUserByMail(appUser.getMail());
//        if(user!=null && user.getRoles().isEmpty()) throw new RuntimeException("User already exists");
//        appUser.setActived(true);
//        appUser.setPassword(bCryptPasswordEncoder.encode(appUser.getPassword()));
//        appUserRepository.save(appUser);
//        addRolesToUser(appUser.getMail(),roles);
//        return appUserRepository.save(appUser);
//    }
//
//    @Override
//    public AppRole save(AppRole role) {
//        return appRoleRepository.save(role);
//    }
//
//    @Override
//    public AppUser loadUserByUsername(String mail) {
//        return appUserRepository.findAppUserByMail(mail);
//    }
//
//    @Override
//    public void addRolesToUser(String mail, List<String> rolenames) {
//        AppUser appUser=appUserRepository.findAppUserByMail(mail);
//        List<AppRole> appRoles = new ArrayList<>();
//        rolenames.forEach(role -> {
//            AppRole appRole=appRoleRepository.findAppRoleByRoleName(role);
//            appRoles.add(appRole);
//        });
//        appUser.getRoles().addAll(appRoles);
//    }
//
//    @Override
//    public AppUser deleteAppUser(String email) {
//        AppUser appUser = loadUserByUsername(email);
//        if(appUser!=null){
//            log.info("user {} exist", email);
//            appUserRepository.delete(appUser);
//            return appUser;
//        }
//        return null;
//    }
//}
