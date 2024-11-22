package kr.sparta.spartaexception.valid;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class ValidatedController {
    @PostMapping("/test-validated/{number}")
    public String testValid(@Min(10) @PathVariable  Integer number, @RequestBody @Valid UserDto userDto) {
        return number + " : " + userDto.toString();
    }
}
