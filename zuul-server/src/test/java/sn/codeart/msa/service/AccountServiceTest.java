package sn.codeart.msa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sn.codeart.msa.model.AppRole;
import sn.codeart.msa.model.AppUser;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class AccountServiceTest {
	
    @Autowired
    private AccountService accountService;
    

    private static AppUser appUser1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

        appUser1 = new AppUser();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test @Order(1)
	void testSaveUser() {
		accountService.save(new AppRole(null,"USER"));
        accountService.save(new AppRole(null,"ADMIN"));
        accountService.save(new AppRole(null,"AUTHOR"));

        appUser1.setPrenom("Alioune Bada");
        appUser1.setNom("NDOYE");
        appUser1.setMail("admin@gmail.com");
        appUser1.setPassword("1234");
        List<String> roles = new ArrayList<>();
        roles.add("USER");
//        roles.add("AUTHOR");
        appUser1 = accountService.saveUser(appUser1, roles);
        Assert.assertEquals("test insertion user 1","admin@gmail.com", appUser1.getMail());
	}

	@Test @Order(2)
	void testUpdateUser() {
		appUser1.setPrenom("Alioune B.");
		List<String> roles = new ArrayList<>();
        roles.add("ADMIN");
        roles.add("AUTHOR");
        
		AppUser appUsersaved = accountService.updateUser(appUser1, appUser1.getMail(), roles);
		List<AppRole> rolessaved = appUsersaved.getRoles();
		rolessaved.forEach(r->{
			System.out.println("role user updated : "+ r.getRoleName());
		});
		Assert.assertNotNull("test update user 1", appUsersaved);
	}

}
