package ir.mapsa.cloth_shop.service.impl;

import ir.mapsa.cloth_shop.dto.ClothDTO;
import ir.mapsa.cloth_shop.mapper.ClothMapper;
import ir.mapsa.cloth_shop.entity.Clothes;
import ir.mapsa.cloth_shop.mapper.GenericMapper;
import ir.mapsa.cloth_shop.repository.ClothesRepository;
import ir.mapsa.cloth_shop.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ClothesServiceImpl extends GenericServiceImpl<Clothes, ClothDTO,Integer> {

    private final ClothesRepository clothesRepository;
    private final ClothMapper clothMapper;

    public ClothesServiceImpl(ClothesRepository clothesRepository, ClothMapper clothMapper) {
        this.clothesRepository = clothesRepository;
        this.clothMapper = clothMapper;
    }

    @Override
    public GenericRepository<Clothes, Integer> getRepository() {
        return clothesRepository;
    }

    @Override
    public GenericMapper<Clothes, ClothDTO> getMapper() {
        return clothMapper;
    }
}

