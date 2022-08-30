package Data.all.city.dto;

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
public class HomeDtoWithList {

    private Integer id;

    @NotBlank
    private String name;

    private DistrictDto districtId;

    private List<HumansDto> humansDtoList;

}
