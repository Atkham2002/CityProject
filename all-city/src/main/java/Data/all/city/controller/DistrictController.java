package Data.all.city.controller;

import Data.all.city.dto.DistrictDto;
import Data.all.city.dto.ResponseDto;
import Data.all.city.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(name = "/district")
@RequiredArgsConstructor
public class DistrictController {

    private final DistrictService districtService;



    @PostMapping(name = "/Path")
    public ResponseDto addDistrict(@RequestBody DistrictDto districtDto){
        return districtService.addDistrict(districtDto);
    }

    @GetMapping("/{id}")
    public ResponseDto getIdDistrict(@PathVariable Integer id){
        return districtService.getByIdDistrict(id);
    }

    @GetMapping
    public ResponseDto getAllDistrict(){
        return districtService.getAllDistrict();
    }

    @DeleteMapping
    public ResponseDto deleteDistrict(@PathVariable Integer id){
        return districtService.deleteByIdDistrict(id);
    }

}
