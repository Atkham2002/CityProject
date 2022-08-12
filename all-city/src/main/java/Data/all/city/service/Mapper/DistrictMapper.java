package Data.all.city.service.Mapper;

import Data.all.city.dto.DistrictDto;
import Data.all.city.dto.DistrictDtoWithList;
import Data.all.city.entity.District;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DistrictMapper {

    District toDistrict(DistrictDto districtDto);

    DistrictDto toDto(District district);

    DistrictDtoWithList toDtoList(District district);

}
