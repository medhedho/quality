package ecommerce.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@EnableWebSecurity
//@Configuration
//@EnableGlobalMethodSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

//
//    @Bean
//    public BCryptPasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//    //auth
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth
//                .inMemoryAuthentication()
//                   .withUser("dhia").password(encoder().encode("password")).roles("USER")
//                .and()
//                    .withUser("souhail").password(encoder().encode("password")).roles("ADMIN");
//    }
//
//    //authorization
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//



   // }



}
