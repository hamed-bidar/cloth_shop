package ir.mapsa.cloth_shop.repository;

import ir.mapsa.cloth_shop.entity.Clothes;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends GenericRepository<Clothes,Integer> {
}
