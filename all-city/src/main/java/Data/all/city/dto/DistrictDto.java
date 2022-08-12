package Data.all.city.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistrictDto {

    private Integer id;

    private String name;

    private Integer cityId;

}
