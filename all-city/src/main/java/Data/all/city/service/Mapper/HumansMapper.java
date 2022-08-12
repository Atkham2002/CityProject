package Data.all.city.service.Mapper;

import Data.all.city.dto.HumansDto;
import Data.all.city.entity.Humans;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HumansMapper {

    Humans toHumans(HumansDto humansDto);

    HumansDto toHumansDto(Humans humans);


}
