package it.mensa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import java.sql.Blob;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Foto {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "prodotto_id")
    private Prodotto prodotto;
    private Blob immagine;
}
