package kr.sparta.spartaexception.controller;

import kr.sparta.spartaexception.exception.ExceptionTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class TestController {
    @GetMapping("/unchecked")
    public String unchecked() {
        ExceptionTest exceptionTest = new ExceptionTest();
        LocalDate localDate = exceptionTest.unchekcedException();

        return localDate.toString();
    }

    @GetMapping("/checked")
    public String checked() {
        ExceptionTest exceptionTest = new ExceptionTest();
        Date date = exceptionTest.checkedException();

        return date.toString();
    }
}
