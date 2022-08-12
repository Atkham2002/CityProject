package Data.all.city.service;

import Data.all.city.dto.DistrictDto;
import Data.all.city.dto.ResponseDto;

public interface DistrictService {

    ResponseDto addDistrict(DistrictDto districtDto);

    ResponseDto getByIdDistrict(Integer id);

    ResponseDto getAllDistrict();

    ResponseDto deleteByIdDistrict(Integer id);

}
