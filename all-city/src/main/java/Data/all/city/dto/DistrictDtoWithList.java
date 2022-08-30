package Data.all.city.dto;

import Data.all.city.entity.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDtoWithList {

    private Integer id;

    @NotBlank
    private String name;

    private CityDto cityId;

    private List<HomeDto> homeDtoList;

}
