package com.uppgift2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    private final OAuth2AuthorizedClientService oauthService;

    @Autowired
    public Controller(
            OAuth2AuthorizedClientService oauthService
    ) {
        this.oauthService = oauthService;
    }

    @GetMapping("/user")
    public String loggin(){
        return "Login Successful";
    }
  
}
