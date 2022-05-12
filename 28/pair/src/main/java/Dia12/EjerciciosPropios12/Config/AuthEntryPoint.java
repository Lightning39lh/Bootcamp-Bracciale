package Dia12.EjerciciosPropios12.Config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;

@Component
public class AuthEntryPoint extends BasicAuthenticationEntryPoint{
    
    @Override
    public void commence (HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx)
        throws IOException, ServerException{
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    }
    @Override
    public void afterPropertiesSet(){
        setRealmName("admin");
        super.afterPropertiesSet();
    }

}
