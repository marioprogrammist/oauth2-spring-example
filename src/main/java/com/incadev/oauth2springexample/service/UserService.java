package com.incadev.oauth2springexample.service;

import com.incadev.oauth2springexample.model.User;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class UserService {

    public User createUser(OAuth2User oAuth2User) {
        User user = new User();
        // Set user attributes from OAuth2User
        user.setName(oAuth2User.getAttribute("name"));
        user.setEmail(oAuth2User.getAttribute("email"));
        return user;
    }


}
