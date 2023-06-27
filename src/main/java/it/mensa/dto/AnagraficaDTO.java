package it.mensa.dto;

import it.mensa.model.Genere;
import it.mensa.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnagraficaDTO {

    private Long id;
    private String nome;
    private String cognome;
    private String residenza;
    private String indirizzo;
    private String luogoNascita;
    private String nazione;
    private Long matricola;
    private Genere genere;
    private LocalDate dataNascita;
    private LocalDate dataCreazione;
    private User user;
}
