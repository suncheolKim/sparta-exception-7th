package kr.sparta.spartaexception.valid;

import jakarta.validation.constraints.Min;
import lombok.Getter;

@Getter
public class UserDto {
    private Long id;
    @Min(20)
    private Long age;

    @Override
    public String toString() {
        return "UserDto{id=" + id + ", age=" + age + '}';
    }
}


