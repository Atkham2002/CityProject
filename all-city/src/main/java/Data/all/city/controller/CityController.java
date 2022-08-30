package Data.all.city.controller;

import Data.all.city.dto.CityDto;
import Data.all.city.dto.ResponseDto;
import Data.all.city.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/city")
public class CityController {

    private final CityService cityService;



    @PostMapping
    public ResponseDto addCity(@RequestBody  CityDto cityDto){
        return cityService.addCity(cityDto);
    }

    @GetMapping("/{id}")
    public ResponseDto getIdCity(@PathVariable Integer id){
        return cityService.getById(id);
    }

    @GetMapping
    public ResponseDto getAllCity(){
        return cityService.getAll();
    }

    @DeleteMapping("/{id}")
    public ResponseDto deleteCity(@PathVariable Integer id){
        return cityService.deleteById(id);
    }


}
