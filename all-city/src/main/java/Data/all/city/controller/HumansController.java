package Data.all.city.controller;

import Data.all.city.dto.HumansDto;
import Data.all.city.dto.ResponseDto;
import Data.all.city.service.HumansService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping(name = "/humans")
public class HumansController {

    private final HumansService humansService;


    @PostMapping
    public ResponseDto addHuman(@RequestBody HumansDto humansDto){
        return humansService.addHumans(humansDto);
    }

    @GetMapping("/{id}")
    public ResponseDto getIdHuman(@PathVariable Integer id){
        return humansService.getByIdHumans(id);
    }

    @GetMapping
    public ResponseDto getAllHuman(){
        return humansService.getAllHumans();
    }

    @DeleteMapping
    public ResponseDto deleteHuman(@PathVariable Integer id){
        return humansService.deleteByIdHumans(id);
    }

}
