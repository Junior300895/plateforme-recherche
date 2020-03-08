//package sn.codeart.msa;
//
//import org.keycloak.adapters.KeycloakConfigResolver;
//import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
//import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
//import org.keycloak.adapters.springsecurity.KeycloakSecurityComponents;
//import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
//import org.springframework.context.annotation.*;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.session.SessionRegistryImpl;
//import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
//import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
//
//@Configuration
//@ComponentScan(
//        basePackageClasses = KeycloakSecurityComponents.class,
//        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.keycloak.adapters.springsecurity.management.HttpSessionManager"))
//@EnableWebSecurity
//class KeyCloakSpringSecurityConfig extends KeycloakWebSecurityConfigurerAdapter {
//
////    @Bean
////    public KeycloakConfigResolver keycloakConfigResolver() {
////        return new KeycloakSpringBootConfigResolver();
////    }
//
//    @Override
//    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
//        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(keycloakAuthenticationProvider());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        //http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.authorizeRequests().antMatchers(
//                "/login/**", "/register/**", "/appUsers/{email}",
//                "/api/ms-ch/**", "/api/ms-ao/**", "/api/ms-pubcom/**",
//                "/api/ms-struct/**").permitAll();
//        //http.authorizeRequests().antMatchers("/api/ms-ao/appeloffres").hasAuthority("ADMIN");
//        http.authorizeRequests().anyRequest().authenticated();
//    }
//}