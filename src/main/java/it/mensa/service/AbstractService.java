package it.mensa.service;

import it.mensa.converter.Converter;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.parser.Entity;

public class AbstractService<DTO> implements ServiceDTO<DTO>{

    CrudRepository<Entity, Long> crudRepository;
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
