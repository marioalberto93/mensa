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
    UserService userService;

    @GetMapping("/login")
    public UserDTO login(@RequestBody LoginDTO loginDTO){
        return userService.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
    }

    @PostMapping("/insertuser")
    public UserDTO insertUser(@RequestBody  UserDTO dto){
        return service.insert(dto);
    }
}
