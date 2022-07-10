package ir.mapsa.cloth_shop.mapper;

import java.util.List;

public interface GenericMapper<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(List<D> dtoList);

    List<D> toDTOList(List<E> EntityList);

}
