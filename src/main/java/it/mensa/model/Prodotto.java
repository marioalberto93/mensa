
package it.mensa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
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

    @ManyToMany(targetEntity=OrarioDisponibile.class)
    @JoinTable(
            name = "prodotto_orario",
            joinColumns = @JoinColumn(name = "prodotto_id"),
            inverseJoinColumns = @JoinColumn(name = "orarioDisponibile_id")
    )
    private Set<OrarioDisponibile> orarioDisponibile;
    @ManyToOne
    private Negozio negozio;
}


