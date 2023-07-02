package it.mensa.service;

import it.mensa.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;


public abstract class AbstractService<Entity, DTO> implements ServiceDTO<DTO>{

    @Autowired
    protected CrudRepository<Entity, Long> repository;
    @Autowired
    protected Converter<Entity, DTO> converter;
    @Override
    public DTO read(long id) {
        return converter.toDTO(repository.findById(id).get());
    }
    @Override
    public DTO insert(DTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }
    @Override
    public DTO update(DTO dto) {
        return converter.toDTO(repository.save(converter.toEntity(dto)));
    }
    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
    @Override
    public Iterable<DTO> getAll() {
        return converter.toDTOList(repository.findAll());
    }
}
