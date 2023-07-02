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
    UserConverter converter;
    @Override
    public AnagraficaDTO toDTO(Anagrafica anagrafica) {
        UserDTO userDTO = converter.toDTO(anagrafica.getUser());
        return new AnagraficaDTO(anagrafica.getId(), anagrafica.getNome(), anagrafica.getCognome(),
                anagrafica.getResidenza(), anagrafica.getIndirizzo(), anagrafica.getLuogoNascita(),
                anagrafica.getNazione(), anagrafica.getMatricola(), anagrafica.getGenere(),
                anagrafica.getDataNascita(), anagrafica.getDataCreazione(), userDTO);
    }

    @Override
    public Anagrafica toEntity(AnagraficaDTO anagraficaDTO) {
        User user = converter.toEntity(anagraficaDTO.getUser());
        return new Anagrafica(anagraficaDTO.getId(), anagraficaDTO.getNome(), anagraficaDTO.getCognome(),
                anagraficaDTO.getResidenza(), anagraficaDTO.getIndirizzo(), anagraficaDTO.getLuogoNascita(),
                anagraficaDTO.getNazione(),anagraficaDTO.getMatricola(), anagraficaDTO.getGenere(),
                anagraficaDTO.getDataNascita(), anagraficaDTO.getDataCreazione(), user);
    }
}
