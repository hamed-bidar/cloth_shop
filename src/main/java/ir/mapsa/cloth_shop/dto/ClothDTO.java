package ir.mapsa.cloth_shop.dto;

import ir.mapsa.cloth_shop.entity.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothDTO {

    private Integer id;
    @NotNull
    @NotBlank
    //@Min
    //@Pattern()
    private String name;

    private Integer  code;

    private List<Size> sizes;
}
