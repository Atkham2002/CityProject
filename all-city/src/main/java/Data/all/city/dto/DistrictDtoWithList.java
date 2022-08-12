package Data.all.city.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDtoWithList {

    private Integer id;

    private String name;

    private Integer cityId;

    private List<HomeDto> homeDtoList;

}
