package Data.all.city.service;

import Data.all.city.dto.CityDto;
import Data.all.city.dto.ResponseDto;

public interface CityService {

    ResponseDto addCity(CityDto cityDto);

    ResponseDto getById(Integer id);

    ResponseDto getAll();

    ResponseDto deleteById(Integer id);


}
