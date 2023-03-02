package com.demo.spring.boot.SpringBootArtifactDemo.services.implementations;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.UserDto;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.User;
import com.demo.spring.boot.SpringBootArtifactDemo.mappers.interfaces.UserMapper;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.UserRepository;
import com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces.UserService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    /*
       L'interface PasswordEncoder est une interface de Spring Security qui permet de gérer le chiffrement des mots de passe des utilisateurs.
        */
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(UserDto userDto) {
        User existingUser = userRepository.findByEmail(userDto.getEmail());
        if (existingUser != null) {
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        userRepository.save(user);

        return UserMapper.toUserDto(user);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        return UserMapper.toUserDto(user);
    }
}
