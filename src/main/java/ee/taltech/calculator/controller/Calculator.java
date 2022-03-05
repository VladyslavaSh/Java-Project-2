package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.CalculationResult1;
import ee.taltech.calculator.dto.CalculationResult2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class Calculator {

    @GetMapping("calculate1")
    public CalculationResult1 calculate1(@RequestParam List<Integer> input){

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

        return new CalculationResult1(MinOdd, SumOfEven, Odds);
    }

    @GetMapping("calculate2")
    public CalculationResult2 calculate2(@RequestParam List<Integer> input){

        List <Integer> Squared = input.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        Integer SumOfEven = input.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        double AverageOfPositives = input.stream()
                .filter(x -> x >= 0)
                .mapToDouble(x -> (double) x)
                .average()
                .orElse(0.0);

        BigDecimal AverageOfPositivesNew = new BigDecimal(AverageOfPositives).setScale(2, RoundingMode.HALF_UP);

        return new CalculationResult2(Squared, SumOfEven, AverageOfPositivesNew.doubleValue());
    }
}

