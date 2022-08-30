package Data.all.city.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class CityDto {


    private Integer id;

    @NotBlank
    private String name;

}
