package com.demo.spring.boot.SpringBootArtifactDemo.services.interfaces;


import com.demo.spring.boot.SpringBootArtifactDemo.dto.UserDto;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.User;
import com.demo.spring.boot.SpringBootArtifactDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    UserDto createUser(UserDto userDto);

    UserDto getUserByEmail(String email);
}
