package ir.mapsa.cloth_shop.mapper;

import ir.mapsa.cloth_shop.dto.ClothDTO;
import ir.mapsa.cloth_shop.entity.Clothes;
import ir.mapsa.cloth_shop.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClothMapper extends GenericMapper<Clothes, ClothDTO>{


}
