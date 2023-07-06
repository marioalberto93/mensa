package it.mensa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.sql.Blob;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "prodotto_id")
    private Prodotto prodotto;
    private Blob immagine;
}