package it.mensa.service;

import it.mensa.converter.AnagraficaConverter;
import it.mensa.converter.UserConverter;
import it.mensa.dao.AnagraficaRepository;
import it.mensa.dto.AnagraficaDTO;
import it.mensa.dto.UserDTO;
import it.mensa.model.Anagrafica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnagraficaService extends AbstractService<Anagrafica, AnagraficaDTO> {

    @Autowired
    AnagraficaConverter anagraficaConverter;

    @Autowired
    AnagraficaRepository anagraficaRepository;
    @Autowired
    UserConverter userConverter;

    public AnagraficaDTO findByUser(UserDTO userDTO){

        return anagraficaConverter.toDTO(anagraficaRepository.findByUser(userConverter.toEntity(userDTO)));
    }

}
