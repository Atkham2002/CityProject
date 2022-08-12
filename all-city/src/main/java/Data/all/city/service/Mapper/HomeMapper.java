package Data.all.city.service.Mapper;

import Data.all.city.dto.HomeDto;
import Data.all.city.dto.HomeDtoWithList;
import Data.all.city.entity.Home;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HomeMapper {

    Home toHome(HomeDto homeDto);

    HomeDto toHomeDto(Home home);

    HomeDtoWithList toHomeList(Home home);

}
