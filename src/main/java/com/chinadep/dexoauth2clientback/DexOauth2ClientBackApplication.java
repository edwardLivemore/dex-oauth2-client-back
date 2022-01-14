package com.chinadep.dexoauth2clientback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableOAuth2Sso
@EnableFeignClients
public class DexOauth2ClientBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DexOauth2ClientBackApplication.class, args);
    }

}
