package Data.all.city.service.Mapper;

import Data.all.city.dto.CityDto;
import Data.all.city.dto.CityDtoWithList;
import Data.all.city.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {


    City  convertToCity(CityDto cityDto);
    CityDto convertToCityDto(City city);

    CityDtoWithList ToWithList(City city);

}
