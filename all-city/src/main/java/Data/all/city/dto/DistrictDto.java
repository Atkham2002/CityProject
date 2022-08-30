package Data.all.city.dto;

import Data.all.city.entity.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistrictDto {

    private Integer id;

    @NotBlank
    private String name;

    private CityDto cityId;

}
