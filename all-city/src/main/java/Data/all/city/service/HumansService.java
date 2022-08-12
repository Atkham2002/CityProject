package Data.all.city.service;

import Data.all.city.dto.HumansDto;
import Data.all.city.dto.ResponseDto;

public interface HumansService {

    ResponseDto addHumans(HumansDto humansDto);

    ResponseDto getByIdHumans(Integer id);

    ResponseDto getAllHumans();

    ResponseDto deleteByIdHumans(Integer id);

}
