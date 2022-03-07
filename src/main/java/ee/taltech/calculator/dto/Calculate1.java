package ee.taltech.calculator.dto;

import ee.taltech.calculator.controller.Calculation;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class Calculate1 {
    private Optional<Integer> minOdd;
    private Integer sumOfEven;
    private List<Integer> odds;

    public Calculate1(List<Integer> numbers) {
        this.minOdd = Calculation.minOdd(numbers);
        this.sumOfEven = Calculation.sumOfEven(numbers);
        this.odds = Calculation.odds(numbers);
    }
}
