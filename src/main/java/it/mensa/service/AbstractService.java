package it.mensa.service;

import it.mensa.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.parser.Entity;

public class AbstractService<DTO> implements ServiceDTO<DTO>{

    @Autowired
    CrudRepository<Entity, Long> crudRepository;
    @Autowired
    Converter<Entity, DTO> converter;
    @Override
    public DTO read(long id) {
        return converter.toDTO(crudRepository.findById(id).get());
    }
    @Override
    public DTO insert(DTO dto) {
        return converter.toDTO(crudRepository.save(converter.toEntity(dto)));
    }
    @Override
    public DTO update(DTO dto) {
        return converter.toDTO(crudRepository.save(converter.toEntity(dto)));
    }
    @Override
    public void delete(long id) {
        crudRepository.deleteById(id);
    }
    @Override
    public Iterable<DTO> getAll() {
        return converter.toDTOList(crudRepository.findAll());
    }
}
