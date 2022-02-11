package io.billbenon.ppmtool.services;

import io.billbenon.ppmtool.domain.User;
import io.billbenon.ppmtool.exceptions.UsernameAlreadyExistsException;
import io.billbenon.ppmtool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser(User newUser) {
        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            // username has to be unique (exception)
            newUser.setUsername(newUser.getUsername());
            newUser.setConfirmPassword("");

            // Make sure that password and confirm password match
            return userRepository.save(newUser);
        } catch (Exception e) {
            throw new UsernameAlreadyExistsException("Username '" + newUser.getUsername() + "' already exists");
        }
    }
}
