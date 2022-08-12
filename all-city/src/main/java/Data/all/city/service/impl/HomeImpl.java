package Data.all.city.service.impl;

import Data.all.city.dto.HomeDto;
import Data.all.city.dto.HomeDtoWithList;
import Data.all.city.dto.ResponseDto;
import Data.all.city.entity.Home;
import Data.all.city.repository.HomeRepository;
import Data.all.city.service.HomeService;
import Data.all.city.service.Mapper.HomeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class HomeImpl implements HomeService {

    private final HomeRepository homeRepository;
    private final HomeMapper homeMapper;

    @Override
    public ResponseDto addHome(HomeDto homeDto) {
        return null;
    }

    @Override
    public ResponseDto getByIdHome(Integer id) {

        Optional<Home> optional = homeRepository.findById(id);
        if (optional.isPresent()){
            Home home = optional.get();
            HomeDtoWithList withList = homeMapper.toHomeList(home);
            return ResponseDto.builder().code(200).success(true).message("getId").data(withList).build();
        }

        return ResponseDto.builder().code(404).success(false).message("not found").build();
    }

    @Override
    public ResponseDto getAllHome() {

        List<Home> homes = homeRepository.findAll();
        List<HomeDto> homeDtos = homes.stream()
                .map(homeMapper::toHomeDto).toList();
        return ResponseDto.builder().code(200).success(true).message("getId").data(homeDtos).build();
    }

    @Override
    public ResponseDto deleteByIdHome(Integer id) {
        return null;
    }
}
