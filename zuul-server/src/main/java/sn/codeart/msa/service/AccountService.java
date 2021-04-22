package sn.codeart.msa.service;


import sn.codeart.msa.model.AppRole;
import sn.codeart.msa.model.AppUser;

import java.util.List;

public interface AccountService {
    AppUser saveUser(AppUser appUser, List<String> roles);
    AppUser updateUser(AppUser appUser, String email, List<String> roles);
    AppUser loadUserByUsername(String mail);
    List<AppUser> getUsers();
    AppUser getUserByMail(String email);
    AppUser deleteAppUser(String email);
    
    AppRole save(AppRole role);
    public void addRolesToUser(String mail, List<String> rolenames);
    List<AppRole> getRoles();
}
