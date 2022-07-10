package ir.mapsa.cloth_shop.service.impl;

import ir.mapsa.cloth_shop.mapper.GenericMapper;
import ir.mapsa.cloth_shop.repository.GenericRepository;
import ir.mapsa.cloth_shop.service.GenericService;

import java.util.Collection;
import java.util.Optional;

public abstract class GenericServiceImpl<E, D, PK> implements GenericService<E, D, PK> {

    public abstract GenericRepository<E, PK> getRepository();

    public abstract GenericMapper<E, D> getMapper();

    @Override
    public void save(D dto) {
        getRepository().save(getMapper().toEntity(dto));


    }

    @Override
    public Optional<D> findById(PK id) {


        //Optional<E> byId = getRepository().findById(id);
        //exception
        return Optional.of(getMapper().toDTO(getRepository().findById(id).get()));
    }

    @Override
    public Collection<D> findAll() {
        return getMapper().toDTOList(getRepository().findAll());
    }
}
