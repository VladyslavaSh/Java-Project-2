package ee.taltech.calculator.controller;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CalculatorOperations {

    public CalculatorOperations(List<Integer> input) {
    }

    public Optional<Integer> MinOdd(List<Integer> input) {
        return input.stream().filter(x -> x % 2 != 0).min(Integer::compare);
    }

    public Integer SumOfEven(List<Integer> input) {
        return input.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public List<Integer> Odds(List<Integer> input) {
        return input.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }

    public List<Integer> Squared(List<Integer> input) {
        return input.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public double AverageOfPositives(List<Integer> input) {
        return input.stream().filter(x -> x >= 0).mapToDouble(x -> (double) x).average().orElse(0.0);
    }
}
