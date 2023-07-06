package it.mensa.converter;

import it.mensa.dto.AnagraficaDTO;
import it.mensa.dto.NegozioDTO;
import it.mensa.model.Anagrafica;
import it.mensa.model.Negozio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NegozioConvert extends AbstractConverter<Negozio, NegozioDTO> {
    @Autowired
    AnagraficaConverter anagraficaConverter;

    @Override
    public NegozioDTO toDTO(Negozio negozio) {
        NegozioDTO negozioDTO = null;
        if (negozio!=null){
            AnagraficaDTO anagraficaDTO = anagraficaConverter.toDTO(negozio.getAnagrafica());
            negozioDTO = new NegozioDTO(negozio.getId(), negozio.getCitta(), negozio.getDescrizione(), negozio.getIndirizzo(), negozio.getNome(), negozio.getProvincia(), anagraficaDTO);
        }
        return negozioDTO;
    }

    @Override
    public Negozio toEntity(NegozioDTO negozioDTO) {
        Negozio negozio = null;
        if (negozioDTO!=null){
            Anagrafica anagrafica= anagraficaConverter.toEntity(negozioDTO.getAnagrafica());
            negozio = new Negozio(negozio.getId(), negozio.getCitta(), negozio.getDescrizione(),negozio.getIndirizzo(), negozio.getNome(), negozio.getProvincia(),anagrafica);
        }
        return negozio;
    }
}
