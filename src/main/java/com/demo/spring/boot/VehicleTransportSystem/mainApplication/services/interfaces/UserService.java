package com.demo.spring.boot.VehicleTransportSystem.mainApplication.services.interfaces;


import com.demo.spring.boot.VehicleTransportSystem.mainApplication.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    UserDto createUser(UserDto userDto);

    UserDto getUserByEmail(String email);
}
