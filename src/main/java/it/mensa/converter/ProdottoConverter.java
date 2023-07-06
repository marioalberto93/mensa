package it.mensa.converter;

import it.mensa.dto.NegozioDTO;
import it.mensa.dto.ProdottoDTO;
import it.mensa.model.Negozio;
import it.mensa.model.Prodotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdottoConverter extends AbstractConverter<Prodotto, ProdottoDTO> {
    @Autowired
    NegozioConvert negozioConvert;
    @Override
    public ProdottoDTO toDTO(Prodotto prodotto) {
        ProdottoDTO prodottoDTO = null;
        if (prodotto!=null){
            NegozioDTO negozioDTO = negozioConvert.toDTO(prodotto.getNegozio());
            prodottoDTO = new ProdottoDTO(prodottoDTO.getId(), prodottoDTO.getNome(), prodotto.getNumeroProdotto(), prodotto.getPrezzo(), prodotto.getDescrizione(), prodotto.getTipo(), prodotto.getFoto(), negozioDTO);
        }
        return prodottoDTO;
    }

    @Override
    public Prodotto toEntity(ProdottoDTO prodottoDTO) {
        Prodotto prodotto = null;
        if (prodottoDTO!=null){
            Negozio negozio = negozioConvert.toEntity(prodottoDTO.getNegozio());
            prodotto= new Prodotto(prodottoDTO.getId(), prodotto.getNome(), prodotto.getNumeroProdotto(), prodotto.getPrezzo(), prodotto.getDescrizione(), prodotto.getTipo(), prodotto.getFoto(), prodotto.getOrarioDisponibile(),negozio);
        }
        return prodotto;
    }
}
