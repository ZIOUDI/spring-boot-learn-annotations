package com.demo.spring.boot.VehicleTransportSystem.services.interfaces;


import com.demo.spring.boot.VehicleTransportSystem.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    UserDto createUser(UserDto userDto);

    UserDto getUserByEmail(String email);
}
