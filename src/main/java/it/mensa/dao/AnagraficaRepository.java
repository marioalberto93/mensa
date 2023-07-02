package it.mensa.dao;

import it.mensa.dto.AnagraficaDTO;
import it.mensa.model.Anagrafica;
import it.mensa.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface AnagraficaRepository extends CrudRepository<Anagrafica, AnagraficaDTO> {

    Anagrafica findByUser(User user);
}
