package ee.taltech.calculator.dto;

import ee.taltech.calculator.controller.Calculation;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Calculate2 {
    private List<Integer> squared;
    private Integer sumOfEven;
    private BigDecimal averageOfPositives;

    public Calculate2(List<Integer> numbers) {
        this.squared = Calculation.squared(numbers);
        this.sumOfEven = Calculation.sumOfEven(numbers);
        this.averageOfPositives = Calculation.averageOfPositives(numbers);
    }
}
