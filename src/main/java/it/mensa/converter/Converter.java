package it.mensa.converter;

import java.util.List;

public interface Converter<Entity, DTO> {

    public DTO toDTO(Entity entity);
    public Entity toEntity(DTO dto);
    public List<DTO> toDTOList(Iterable<Entity> entitieList);
    public List<Entity> toEntityList(Iterable<DTO> dtoList);
}
