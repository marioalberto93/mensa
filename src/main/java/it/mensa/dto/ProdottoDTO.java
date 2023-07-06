package it.mensa.dto;

import it.mensa.model.Foto;
import it.mensa.model.Negozio;
import it.mensa.model.TipoProdotto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdottoDTO {

    private Long id;
    private String nome;
    private Long numeroProdotto;
    private float prezzo;
    private String descrizione;
    private TipoProdotto tipo;
    private Set<Foto> foto;
    private NegozioDTO negozio;
}
