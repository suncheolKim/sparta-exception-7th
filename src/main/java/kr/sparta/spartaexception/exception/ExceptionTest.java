package kr.sparta.spartaexception.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ExceptionTest {
    public Date checkedException() {
        // 1초 sleep
        try {
            Thread.sleep(1000); // InterruptedException 발생
        } catch (InterruptedException e) {
            throw new RuntimeException("sleep 중 오류 발생");
        }


        // 날짜 관련 Checked Exception
        String dateStr = "2024/11/04"; // 형식이 맞지 않음
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null; // ParseException 발생
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            date = new Date(0L); // 예외 발생시 "January 1, 1970, 00:00:00 GMT"로 반환
        }

        return date;
    }

    public LocalDate unchekcedException() {
        // 날짜 관련 Checked Exception
        String dateStr = "04-11-2024"; // 올바른 형식은 "yyyy-MM-dd"

        return LocalDate.parse(dateStr); // DateTimeParseException 발생
    }
}
