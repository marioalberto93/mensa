
package it.mensa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float costoTotale;
    private LocalDate dataPrenotazione;
    private Long numeroPrenotazione;

    @OneToOne
    @JoinColumn(name = "prodotto_id")
    private Prodotto prodotto;
    @ManyToOne
    @JoinColumn(name = "anagrafica_id")
    private Anagrafica anagrafica;

}
