package Data.all.city.service.impl;

import Data.all.city.dto.DistrictDto;
import Data.all.city.dto.DistrictDtoWithList;
import Data.all.city.dto.ResponseDto;
import Data.all.city.entity.District;
import Data.all.city.repository.DistrictRepository;
import Data.all.city.service.DistrictService;
import Data.all.city.service.Mapper.DistrictMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DistrictImpl implements DistrictService {

    private final DistrictMapper districtMapper;
    private final DistrictRepository districtRepository;

    @Override
    public ResponseDto addDistrict(DistrictDto districtDto) {
        return null;
    }

    @Override
    public ResponseDto getByIdDistrict(Integer id) {
        Optional<District> optional = districtRepository.findById(id);
        if (optional.isPresent()){
            District district = optional.get();
            DistrictDtoWithList dtoWithList = districtMapper.toDtoList(district);

            return ResponseDto.builder().code(200).success(true).message("successfully getId").data(dtoWithList).build();
        }

        return ResponseDto.builder().code(404).success(false).message("Data not found").data(null).build();
    }

    @Override
    public ResponseDto getAllDistrict() {
        List<District> districts = districtRepository.findAll();
        List<DistrictDto> districtDtos = districts.stream()
                .map(districtMapper::toDto).toList();
        return ResponseDto.builder().code(200).success(true).message("successfully getId").data(districtDtos).build();
    }

    @Override
    public ResponseDto deleteByIdDistrict(Integer id) {
        return null;
    }
}
