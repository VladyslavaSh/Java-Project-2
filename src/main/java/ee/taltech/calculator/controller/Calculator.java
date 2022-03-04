package ee.taltech.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping
    public String test() {
        return "Hello!";
    }

}
