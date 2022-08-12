package Data.all.city.service.impl;

import Data.all.city.dto.CityDto;
import Data.all.city.dto.CityDtoWithList;
import Data.all.city.dto.ResponseDto;
import Data.all.city.entity.City;
import Data.all.city.repository.CityRepository;
import Data.all.city.service.CityService;
import Data.all.city.service.Mapper.CityMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CityImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Override
    public ResponseDto addCity(CityDto cityDto) {
        return null;
    }

    @Override
    public ResponseDto getById(Integer id) {

        Optional<City> optional = cityRepository.findById(id);
        if (optional.isPresent()){
            City city = optional.get();
            CityDtoWithList cityDtoWithList = cityMapper.ToWithList(city);

            return ResponseDto.builder().code(200).message("successfully getId").success(true).data(cityDtoWithList).build();
        }

        return ResponseDto.builder().code(404).success(false).message("data not founded").data(null).build();
    }

    @Override
    public ResponseDto getAll() {
        List<City> cities = cityRepository.findAll();
        List<CityDto> cityDtos = cities.stream()
                .map(cityMapper::convertToCityDto).toList();

        return ResponseDto.builder().code(200).message("successfully getAll").success(true).data(cityDtos).build();
    }

    @Override
    public ResponseDto deleteById(Integer id) {

        return null;
    }

}
