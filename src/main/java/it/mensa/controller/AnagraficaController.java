package it.mensa.controller;

import it.mensa.dto.AnagraficaDTO;
import it.mensa.dto.UserDTO;
import it.mensa.service.AnagraficaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anagrafica")
@CrossOrigin("http://localhost:4200")
public class AnagraficaController extends AbstractController<AnagraficaDTO>{

    @Autowired
    AnagraficaService anagraficaService;

    @PostMapping("/findByUser")
    public AnagraficaDTO findByUser(@RequestBody UserDTO userDTO){
        return anagraficaService.findByUser(userDTO);
    }
}
