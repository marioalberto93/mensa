package it.mensa.service;

import it.mensa.converter.UserConverter;
import it.mensa.dao.UserRepository;
import it.mensa.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<UserDTO>{
    @Autowired
    public UserRepository repository;
    @Autowired
    public UserConverter converter;

    public UserDTO findUserByUsernameAndPassword(String username, String password){
        return converter.toDTO(repository.findUserByUsernameAndPassword(username, password));
    }
}
