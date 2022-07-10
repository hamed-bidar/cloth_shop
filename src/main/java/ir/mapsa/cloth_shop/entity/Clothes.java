package ir.mapsa.cloth_shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@Table(name = "cloth")
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//in AUTO mode spring data decides to use which one
    @Column(name = "id", nullable = false)
    private Integer clothId;

    //@NotNull can be on DTO or model , this @notNull say when an entry comes it must be notNull
    // if t be null throw an exception,
    //but  nullable = false means the DB column must not be null(@NotNull doesn't do this because it checks
    // just the object when entering data)
    // spring-boot-starter-validation dependency handles @NotNull
    @Column(name = "tbl_name" ,unique = true,length = 30,nullable = false)
    private String name;

    //@Enumerated uses for just one enum
    //@OneToMany & others uses for tables

    @ElementCollection(targetClass = Size.class)
    @Column(name ="tbl_size" )
    //when we wanna a list of something that we dnt want to define it as a specific class we use @ElementCollection
    //here  creates a table for size but size in not a class
    private List<Size> sizes;

}
