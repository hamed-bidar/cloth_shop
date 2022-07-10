package ir.mapsa.cloth_shop.mapper;

import ir.mapsa.cloth_shop.dto.ClothDTO;
import ir.mapsa.cloth_shop.entity.Clothes;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ClothMapper extends GenericMapper<Clothes, ClothDTO> {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Clothes clothes,ClothDTO clothDTO);
    /*for ex:
    when wanna update an entity -> /cloth/4
                                     "name": "scarf",   -->       "name": "jeans",
                                     "code": 4,                   "code": ,
                                     "sizes":"S"                  "sizes":

                       and I just want to change "name" not others
      so in incoming DTO we just have "name" and others are null
      if we dnt use partial update ,null parameters will set on entity
      but now nulls will ignore
    */
}
