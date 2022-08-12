package Data.all.city.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HomeDto {

    private Integer id;

    private String name;

    private Integer districtId;


}

