package Data.all.city.controller;

import Data.all.city.dto.CityDto;
import Data.all.city.dto.HomeDto;
import Data.all.city.dto.ResponseDto;
import Data.all.city.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

//@RequestMapping(name = "/home")
public class HomeController {

    private final HomeService homeService;


    @PostMapping
    public ResponseDto addHome(@RequestBody HomeDto homeDto){
        return homeService.addHome(homeDto);
    }

    @GetMapping("/{id}")
    public ResponseDto getIdHome(@PathVariable Integer id){
        return homeService.getByIdHome(id);
    }

    @GetMapping
    public ResponseDto getAllHome(){
        return homeService.getAllHome();
    }

    @DeleteMapping
    public ResponseDto deleteHome(@PathVariable Integer id){
        return homeService.deleteByIdHome(id);
    }

}
