package Data.all.city.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "home")
public class Home {

    @Id
    @GeneratedValue(generator = "home_seq")
    @SequenceGenerator(name = "home_seq", sequenceName = "home_id_seq", allocationSize = 1)
    private Integer id;

    private String name;

    private Integer districtId;

    @OneToMany(mappedBy = "homeId")
    List<Humans> humans;
}
