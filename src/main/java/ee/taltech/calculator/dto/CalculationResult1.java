package ee.taltech.calculator.dto;

import java.util.List;
import java.util.Optional;

public class CalculationResult1 {
    private Optional<Integer> calculation1;
    private Integer calculation2;
    private List<Integer> calculation3;

    public CalculationResult1(Optional<Integer> calculation1, Integer calculation2, List<Integer> calculation3) {
        this.calculation1 = calculation1;
        this.calculation2 = calculation2;
        this.calculation3 = calculation3;
    }

    public Optional<Integer> getCalculation1() { return calculation1;}

    public Integer getCalculation2() {
        return calculation2;
    }

    public List <Integer> getCalculation3() {
        return calculation3;
    }
}
