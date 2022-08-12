package Data.all.city.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(generator = "city_seq")
    @SequenceGenerator(name = "city_seq", sequenceName = "city_id_seq", allocationSize = 1)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "cityId")
    private List<District> districts;

}
