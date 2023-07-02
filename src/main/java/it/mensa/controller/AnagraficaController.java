package it.mensa.controller;

import it.mensa.dto.AnagraficaDTO;
import it.mensa.dto.UserDTO;
import it.mensa.service.AnagraficaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/anagrafica")
public class AnagraficaController extends AbstractController<AnagraficaDTO>{

    @Autowired
    AnagraficaService anagraficaService;

    @PostMapping("/findbyuser")
    public AnagraficaDTO findByUser(@RequestBody  UserDTO userDTO){

        return anagraficaService.findByUser(userDTO);
    }

    @PostMapping("/insertAnagrafica")
    public AnagraficaDTO insertUser(@RequestBody  AnagraficaDTO dto){
        return service.insert(dto);
    }


}
