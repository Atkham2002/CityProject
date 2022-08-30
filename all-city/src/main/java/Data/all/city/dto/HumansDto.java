package Data.all.city.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HumansDto {

    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    private HomeDto homeId;

}
