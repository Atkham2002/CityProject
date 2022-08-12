package Data.all.city.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HumansDto {

    private Integer id;

    private String name;

    private String surname;

    private Integer homeId;

}
