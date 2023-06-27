package it.mensa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private Long numeroProdotto;
    private float prezzo;
    private String descrizione;
    private TipoProdotto tipo;

    @OneToMany(mappedBy = "prodotto", fetch = FetchType.LAZY)
    private Set<Foto> foto;

    @OneToMany(mappedBy = "prodotto")
    private Set<OrarioDisponibile> orarioDisponibile;
    @ManyToOne
    private Negozio negozio;
}
