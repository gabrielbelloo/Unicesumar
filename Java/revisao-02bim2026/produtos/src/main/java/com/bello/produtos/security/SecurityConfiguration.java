package com.bello.produtos.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){
        /*
         *  Configurações de segurança
         */

        return httpSecurity
                /*
                 *   Desabilita o csrf
                 *   Pois autentificação é via token
                 */
                .csrf(csrf -> csrf.disable())
                /*
                 *   Define aplicação STATELESS
                 *   Servidor não guarda sessão do usuário
                 *   Cada sessão precisa enviar token novamente
                 */
                .sessionManagement(session ->
                        session.sessionCreationPolicy
                                (SessionCreationPolicy.STATELESS))
                /*
                 *  Configurações de permissões das rotas
                 */
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                        .requestMatchers(HttpMethod.POST, "/auth/register").permitAll()
                        .requestMatchers(HttpMethod.POST, "/produtos").hasRole("ADMIN")
                        .anyRequest().authenticated()).build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
        throws Exception {
        /*
         *  Autentifica usuários, senhas e permissões
         *  É usado no login
         */
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        /*
         *  Criptografa senhas
         *  Utilizada para criptografar senhas antes de salvar no banco e
         *  descriptografar senhas ao autenticar
         */
        return new BCryptPasswordEncoder();
    }
}