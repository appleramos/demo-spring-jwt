package com.fortis.demospringjwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // query from DB username
        final String storedUsername = "fortis";
        if (username.equals(storedUsername)) {
            return new User(storedUsername, "password", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Username not found");
        }
    }
}
