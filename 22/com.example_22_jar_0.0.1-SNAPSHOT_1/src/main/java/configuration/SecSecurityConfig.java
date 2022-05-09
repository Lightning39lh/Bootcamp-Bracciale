package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication()
        .withUser("admin").password("123456").roles("ADMIN");
       //.withUser("admin").password(passwordEncoder().encode("123456")).roles("ADMIN");
    }

   /* @Override
    protected void configure(final HttpSecurity http) throws Exception {
       http
      .csrf().disable()
      .authorizeRequests()
      .antMatchers("/**").hasRole("ADMIN")
      .antMatchers("/anonymous*").anonymous()
      .antMatchers("/login*").permitAll()
      .anyRequest().authenticated()
      .and()
      .formLogin()
      .loginPage("/login.html")
      .loginProcessingUrl("/perform_login")
      .defaultSuccessUrl("/person/all", true)
      .failureUrl("/login.html?error=true")
      //.failureHandler(authenticationFailureHandler())
      .and()
      .logout()
      .logoutUrl("/perform_logout")
      .deleteCookies("JSESSIONID");
      //.logoutSuccessHandler(logoutSuccessHandler());
    }*/
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
       http
      .authorizeRequests()
      .antMatchers("/***").hasAnyRole("ADMIN")
      .and()
      .formLogin()
      .loginPage("/login.html")
      //.loginProcessingUrl("/perform_login")
      .defaultSuccessUrl("/person/all", true)
      .failureUrl("/login.html?error=true")       
      .permitAll();
    }
    @Bean 
    public PasswordEncoder passwordEncoder() { 
        return new BCryptPasswordEncoder(); 
    }
      public SecSecurityConfig() {
      super();
    }
}
