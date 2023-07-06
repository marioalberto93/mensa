package it.mensa.dto;

import it.mensa.model.Anagrafica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NegozioDTO {
    private Long id;
    private String citta;
    private String descrizione;
    private String indirizzo;
    private String nome;
    private String provincia;

    private AnagraficaDTO anagrafica;
}
