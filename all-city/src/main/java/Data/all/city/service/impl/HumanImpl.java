package Data.all.city.service.impl;

import Data.all.city.dto.HumansDto;
import Data.all.city.dto.ResponseDto;
import Data.all.city.entity.Humans;
import Data.all.city.repository.HumansRepository;
import Data.all.city.service.HumansService;
import Data.all.city.service.Mapper.HumansMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class HumanImpl implements HumansService {

    private final HumansMapper humansMapper;
    private final HumansRepository humansRepository;

    @Override
    public ResponseDto addHumans(HumansDto humansDto) {
        return null;
    }

    @Override
    public ResponseDto getByIdHumans(Integer id) {
        Optional<Humans> optional = humansRepository.findById(id);
        if (optional.isPresent()){
            Humans humans = optional.get();
            HumansDto humansDto = humansMapper.toHumansDto(humans);
            return ResponseDto.builder().code(200).success(true).message("getId").data(humansDto).build();
        }
        return ResponseDto.builder().code(404).success(false).message("not found").data(null).build();
    }

    @Override
    public ResponseDto getAllHumans() {
        List<Humans> humansList = humansRepository.findAll();
        List<HumansDto> humansDtoList = humansList.stream()
                .map(humansMapper::toHumansDto).toList();
        return ResponseDto.builder().code(200).success(true).message("getId").data(humansDtoList).build();
    }

    @Override
    public ResponseDto deleteByIdHumans(Integer id) {
        return null;
    }
}
