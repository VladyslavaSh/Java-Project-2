package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.CalculationResult1;
import ee.taltech.calculator.dto.CalculationResult2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@RestController
public class Calculator {

    @GetMapping("calculate1")
    public CalculationResult1 calculate1(@RequestParam List<Integer> input){

        CalculatorOperations list = new CalculatorOperations(input);
        Optional<Integer> MinOdd = list.MinOdd(input);
        Integer SumOfEven = list.SumOfEven(input);
        List<Integer> Odds = list.Odds(input);

        return new CalculationResult1(MinOdd, SumOfEven, Odds);
    }

    @GetMapping("calculate2")
    public CalculationResult2 calculate2(@RequestParam List<Integer> input){

        CalculatorOperations list = new CalculatorOperations(input);
        List <Integer> Squared = list.Squared(input);
        Integer SumOfEven = list.SumOfEven(input);
        double AverageOfPositives = list.AverageOfPositives(input);

        BigDecimal AverageOfPositivesNew = new BigDecimal(AverageOfPositives).setScale(2, RoundingMode.HALF_UP);

        return new CalculationResult2(Squared, SumOfEven, AverageOfPositivesNew.doubleValue());
    }
}

