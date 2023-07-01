package it.mensa.converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<Entity,DTO> implements Converter<Entity, DTO> {

    @Override
    public List<DTO> toDTOList(Iterable<Entity> entityList) {
        List<DTO> list = new ArrayList<>();

        if(entityList!=null){
            for (Entity entity: entityList) {
                DTO dto = toDTO(entity);
                list.add(dto);
            }
        }
        return list;
    }

    @Override
    public List<Entity> toEntityList(Iterable<DTO> dtoList) {
        List<Entity> entityList = new ArrayList<>();

        if(dtoList!=null){
            for (DTO dto : dtoList){
                Entity entity = toEntity(dto);
                entityList.add(entity);
            }
        }
        return entityList;
    }
}
