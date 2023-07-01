package it.mensa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anagrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private User user;


}