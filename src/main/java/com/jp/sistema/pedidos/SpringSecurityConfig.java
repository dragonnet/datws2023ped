package com.jp.sistema.pedidos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig  {
	
	 @Bean 
     public static BCryptPasswordEncoder passwordEncoder() {
         return new BCryptPasswordEncoder();
     }
	 
	 @Bean
     public UserDetailsService userDetailsService()throws Exception{
                 
         InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
          manager.createUser(User
                     .withUsername("admin")
                     .password(passwordEncoder().encode("admin2023"))
                     .roles("ADMIN","USER")
                     .build());
         
         return manager;
     }
	 
	 @Bean
     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
  
         http.authorizeRequests().antMatchers("/", "/css/**", "/js/**", "/images/**", "/listar").permitAll()
         		 .antMatchers("/").hasAnyRole("ADMIN")
         		 .antMatchers("/index/**").hasAnyRole("ADMIN")
                 .antMatchers("/pedido/**").hasAnyRole("ADMIN")
                 .antMatchers("/main/**").hasAnyRole("ADMIN")
                 .antMatchers("/access/**").hasAnyRole("ADMIN")
                 .antMatchers("/loaditems/**").hasAnyRole("ADMIN")
                 .antMatchers("/form/**").hasAnyRole("ADMIN")
                 .anyRequest().authenticated()
                 .and()
                 .formLogin().loginPage("/login")
                 .permitAll()
                 .and()
                 .logout().permitAll();
  
         return http.build();
     }
     
 }
