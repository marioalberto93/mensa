package it.mensa.service;

import it.mensa.dao.UserRepository;
import it.mensa.dto.UserDTO;
import it.mensa.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User,UserDTO>{

    public UserDTO findByUsernameAndPassword(String username, String password) {
        return converter.toDTO(((UserRepository)repository).findByUsernameAndPassword(username, password));
    }
}
