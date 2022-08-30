package Data.all.city.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "humans")
public class Humans {

    @Id
    @GeneratedValue(generator = "humans_seq")
    @SequenceGenerator(name = "humans_seq", sequenceName = "humans_id_seq", allocationSize = 1)    private Integer id;

    private String name;

    @Column(name = "surname")
    private String surname;

    @ManyToOne
    private Home homeId;

}
