package Data.all.city.service;

import Data.all.city.dto.HomeDto;
import Data.all.city.dto.ResponseDto;
import org.springframework.stereotype.Repository;

public interface HomeService {

    ResponseDto addHome(HomeDto homeDto);

    ResponseDto getByIdHome(Integer id);

    ResponseDto getAllHome();

    ResponseDto deleteByIdHome(Integer id);

}
