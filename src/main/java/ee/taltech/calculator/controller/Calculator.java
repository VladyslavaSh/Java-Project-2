package ee.taltech.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class Calculator {

    @GetMapping("calculate1")
    public void calculate1(@RequestParam List<Integer> input){

        Optional<Integer> MinOdd = input.stream()
                .filter(x -> x % 2 != 0)
                .min(Integer::compare);

        Integer SumOfEven = input.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        List <Integer> Odds = input.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }
}

