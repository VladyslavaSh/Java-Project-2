package ee.taltech.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Calculator {

    @GetMapping
    public String test() {
        return "Hello!";
    }

    @GetMapping("calculate1")
    public void calculate1(@RequestParam List<Integer> input){

        Optional<Integer> MinOdd = input.stream()
                .filter(x -> x % 2 != 0)
                .min(Integer::compare);
        
    }
}

