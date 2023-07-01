package it.mensa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Negozio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String citta;
    private String descrizione;
    private String indirizzo;
    private String nome;
    private String provincia;
    @OneToOne
    private Anagrafica anagrafica;

}

