package ir.mapsa.cloth_shop.service;

import java.util.Collection;
import java.util.Optional;

public  interface GenericService <E,D,PK> {
    //E for entity
    //D for DTO
    //PK for id

    void save (D dto);
    Optional<D> findById (PK id);
    Collection<D> findAll();
    //use collection because if a class wanna return List , other one Set or ...

}
