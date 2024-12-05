package com.example.calculator_backend;
import org.springframework.web.bind.annotation.*;

// @RestContoroller는 이 클래스가 백엔드 클래스 임을 알려줍니다
@RestController
public class Calculator {

    // 1. 더하기 요청 처리: http://백엔드IP:8080/add URL에서 호출합니다
    @PostMapping("/add")
    //@RequestParam("num1") double number1 : 사용자가 num1폼에 입력한 값을 변수 number1에 대입
    //@RequestParam("num2") double number2 : 사용자가 num2폼에 입력한 값을 변수 number2에 대입
    public double add(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 + number2;
    }
    
    // 2. 빼기 요청 처리: http://백엔드IP:8080/subtract URL에서 호출합니다
    @PostMapping("/subtract")
    //@RequestParam("num1") double number1 : 사용자가 num1폼에 입력한 값을 변수 number1에 대입
    //@RequestParam("num2") double number2 : 사용자가 num2폼에 입력한 값을 변수 number2에 대입
    public double subtract(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 - number2;
    }

    // 3. 곱하기 요청 처리: http://백엔드IP:8080/multiply URL에서 호출합니다
    @PostMapping("/multiply")
    //@RequestParam("num1") double number1 : 사용자가 num1폼에 입력한 값을 변수 number1에 대입
    //@RequestParam("num2") double number2 : 사용자가 num2폼에 입력한 값을 변수 number2에 대입
    public double multiply(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 * number2;
    }

    // 3. 나누기 요청 처리: http://백엔드IP:8080/divide URL에서 호출합니다
    @PostMapping("/divide")
    //@RequestParam("num1") double number1 : 사용자가 num1폼에 입력한 값을 변수 number1에 대입
    //@RequestParam("num2") double number2 : 사용자가 num2폼에 입력한 값을 변수 number2에 대입
    public double divide(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 / number2;
    }

}
