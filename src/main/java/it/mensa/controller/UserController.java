package it.mensa.controller;

import it.mensa.dto.LoginDTO;
import it.mensa.dto.UserDTO;
import it.mensa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController extends AbstractController<UserDTO>{

    @Autowired
    UserService service;

    @GetMapping("/login")
    public UserDTO login(@RequestBody LoginDTO loginDTO){
        return service.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
    }
}
