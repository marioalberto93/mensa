package it.mensa.converter;

import it.mensa.dto.AnagraficaDTO;
import it.mensa.dto.UserDTO;
import it.mensa.model.Anagrafica;
import it.mensa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnagraficaConverter extends AbstractConverter<Anagrafica, AnagraficaDTO>{

    @Autowired
    UserConverter userConverter;

    @Override
    public AnagraficaDTO toDTO(Anagrafica anagrafica) {
        AnagraficaDTO anagraficaDTO = null;
        if (anagrafica != null) {
            UserDTO userDTO = userConverter.toDTO(anagrafica.getUser());
            anagraficaDTO = new AnagraficaDTO(anagrafica.getId(), anagrafica.getNome(), anagrafica.getCognome(), anagrafica.getResidenza(), anagrafica.getIndirizzo(), anagrafica.getLuogoNascita(), anagrafica.getNazione(), anagrafica.getMatricola(), anagrafica.getGenere(), anagrafica.getDataNascita(), anagrafica.getDataCreazione(), userDTO);
        }
        return anagraficaDTO;
    }

    @Override
    public Anagrafica toEntity(AnagraficaDTO anagraficaDTO) {
        Anagrafica anagrafica = null;
        if (anagraficaDTO!=null) {
            User user = userConverter.toEntity(anagraficaDTO.getUser());
            anagrafica =  new Anagrafica(anagraficaDTO.getId(), anagraficaDTO.getNome(), anagraficaDTO.getCognome(), anagraficaDTO.getResidenza(), anagraficaDTO.getIndirizzo(), anagraficaDTO.getLuogoNascita(), anagraficaDTO.getNazione(), anagraficaDTO.getMatricola(), anagraficaDTO.getGenere(), anagraficaDTO.getDataNascita(), anagraficaDTO.getDataCreazione(), user);
        }
        return anagrafica;
    }
}
