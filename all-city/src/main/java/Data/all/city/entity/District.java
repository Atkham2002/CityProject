package Data.all.city.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "district")
public class District {

    @Id
    @GeneratedValue(generator = "district_seq")
    @SequenceGenerator(name = "district_seq", sequenceName = "district_id_seq", allocationSize = 1)    private Integer id;

    private String name;

    @ManyToOne
    private City cityId;

    @OneToMany(mappedBy = "districtId")
    @Fetch(FetchMode.SUBSELECT)
    private List<Home> homes;

}
