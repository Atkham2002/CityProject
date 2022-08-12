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
public class HomeDtoWithList {

    private Integer id;

    private String name;

    private Integer districtId;

    private List<HumansDto> humansDtoList;

}
