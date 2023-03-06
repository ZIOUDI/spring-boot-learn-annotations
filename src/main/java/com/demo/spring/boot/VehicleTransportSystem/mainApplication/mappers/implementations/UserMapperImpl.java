package com.demo.spring.boot.VehicleTransportSystem.mainApplication.mappers.implementations;

import org.springframework.stereotype.Service;

/*

 Si vous souhaitez implémenter l'interface UserMapper manuellement sans utiliser une bibliothèque de mappage d'objets telle que MapStruct,

  vous pouvez créer une classe concrète qui implémente cette interface.
  Voici un exemple d'implémentation pour l'interface UserMapper

 */
@Service  //  l'annotation "@Service" pour indiquer que c'est une classe de service.
public class UserMapperImpl   {

    /*
    @Override
    public User toUser(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }

    @Override
    public UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }

    @Override
    public void updateUserFromDto(UserDto userDto, User user) {
        if (userDto.getEmail() != null) {
            user.setEmail(userDto.getEmail());
        }
        if (userDto.getFirstName() != null) {
            user.setFirstName(userDto.getFirstName());
        }
        if (userDto.getLastName() != null) {
            user.setLastName(userDto.getLastName());
        }
    }*/
}
