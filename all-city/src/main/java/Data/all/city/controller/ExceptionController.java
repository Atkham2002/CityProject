package Data.all.city.controller;

import Data.all.city.dto.ResponseDto;
import Data.all.city.dto.ValidatorDto;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice

public class ExceptionController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseDto<List<ValidatorDto>>validatorException(MethodArgumentNotValidException ex){
        List<ValidatorDto> errors =ex.getBindingResult().getFieldErrors().stream().map(fieldError -> new ValidatorDto(fieldError.getField(), fieldError.getDefaultMessage())).toList();
        return ResponseDto.<List<ValidatorDto>>builder().code(-3).message("validator errors").errors(errors).success(false).build();
    }

}
