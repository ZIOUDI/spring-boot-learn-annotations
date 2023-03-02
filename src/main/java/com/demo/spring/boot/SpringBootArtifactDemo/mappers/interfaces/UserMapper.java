package com.demo.spring.boot.SpringBootArtifactDemo.mappers.interfaces;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.demo.spring.boot.SpringBootArtifactDemo.dto.UserDto;
import com.demo.spring.boot.SpringBootArtifactDemo.entities.User;
import jakarta.persistence.EnumType;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "email", source = "userDto.email"),
            @Mapping(target = "password", source = "userDto.password"),
            @Mapping(target = "firstName", source = "userDto.firstName"),
            @Mapping(target = "lastName", source = "userDto.lastName")
    })
    User toUser(UserDto userDto);

    @Mappings({
            @Mapping(target = "email", source = "user.email"),
            @Mapping(target = "firstName", source = "user.firstName"),
            @Mapping(target = "lastName", source = "user.lastName")
    })
    static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }
    @Mappings({
            @Mapping(target = "email", source = "userDto.email"),
            @Mapping(target = "firstName", source = "userDto.firstName"),
            @Mapping(target = "lastName", source = "userDto.lastName")
    })
    void updateUserFromDto(UserDto userDto, @MappingTarget User user);
}

/*

Explications :

    Nous avons déclaré l'interface UserMapper avec l'annotation @Mapper, qui définit cette interface comme une classe de mappage. Nous avons également défini le paramètre "componentModel" à "spring" pour que Spring puisse injecter des dépendances dans la classe de mappage.

    Nous avons créé une instance de notre classe de mappage en utilisant la méthode statique "Mappers.getMapper(UserMapper.class)".

    Nous avons créé trois méthodes de mappage différentes :
        toUser : Cette méthode prend un objet UserDto en entrée et renvoie un objet User. Nous avons utilisé l'annotation @Mappings pour spécifier les correspondances entre les champs de l'objet UserDto et de l'objet User. Nous avons ignoré le champ "id" car il sera généré automatiquement par la base de données.
        toUserDto : Cette méthode prend un objet User en entrée et renvoie un objet UserDto. Nous avons spécifié les correspondances entre les champs des deux objets à l'aide de l'annotation @Mappings.
        updateUserFromDto : Cette méthode met à jour un objet User à partir d'un objet UserDto. Nous avons utilisé l'annotation @MappingTarget pour spécifier que l'objet User est la cible de la mise à jour, et nous avons utilisé l'annotation @Mappings pour spécifier les correspondances entre les champs des deux objets.

    Nous avons également défini une instance statique "INSTANCE" de notre classe de mappage, ce qui nous permettra d'utiliser cette instance dans d'autres classes.

Ceci est juste un exemple d'implémentation pour l'interface UserMapper, il peut être adapté en fonction des besoins spécifiques de votre projet.


 */
