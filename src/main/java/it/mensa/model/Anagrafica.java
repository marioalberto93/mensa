package it.mensa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anagrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User user;


}