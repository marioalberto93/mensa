package it.mensa.dao;

import it.mensa.model.Prodotto;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ProdottoRepository extends CrudRepository<Prodotto, Long> {


}
