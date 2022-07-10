package ir.mapsa.cloth_shop.controller;

import ir.mapsa.cloth_shop.dto.ClothDTO;
import ir.mapsa.cloth_shop.service.ClothService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Data
@RequestMapping("v1/cloth")
public class ClothController {



    private final ClothService clothService;


    @PostMapping
    public void save (@RequestBody @Valid ClothDTO clothDTO){
        //@Valid checks @NotNull and other validations
        clothService.save(clothDTO);
    }

}
