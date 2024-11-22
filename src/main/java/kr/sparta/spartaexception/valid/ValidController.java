package kr.sparta.spartaexception.valid;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidController {
    @PostMapping("/test-valid")
    public String testValid(@RequestBody @Valid UserDto userDto) {
        return userDto.toString();
    }
}
