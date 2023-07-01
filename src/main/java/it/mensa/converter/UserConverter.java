package it.mensa.converter;

import it.mensa.dto.UserDTO;
import it.mensa.model.User;

public class UserConverter extends AbstractConverter<User, UserDTO>{

    @Override
    public UserDTO toDTO(User user) {
        UserDTO userDTO = null;
        if (user != null) {
            userDTO = new UserDTO(user.getId(), user.getUsername(), user.getPassword(), user.getUsertype());
            return userDTO;
        }
        return userDTO;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        User user = null;
        if (userDTO != null){
            user = new User(userDTO.getId(), userDTO.getUsername(), userDTO.getPassword(), userDTO.getUsertype());
        }
        return user;
    }
}
