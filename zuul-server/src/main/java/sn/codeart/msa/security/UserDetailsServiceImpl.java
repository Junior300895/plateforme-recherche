//package sn.codeart.msa.security;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import sn.codeart.msa.model.AppUser;
//import sn.codeart.msa.service.AccountService;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private AccountService accountService;
//
//    @Override
//    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
//        AppUser appUser=accountService.loadUserByUsername(mail);
//        if(appUser==null) throw new UsernameNotFoundException("invalid user");
//        Collection<GrantedAuthority> authorities=new ArrayList<>();
//        appUser.getRoles().forEach(r->{
//            authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
//        });
//        return new User(appUser.getMail(),appUser.getPassword(),authorities);
//    }
//}
