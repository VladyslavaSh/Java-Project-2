package ee.taltech.calculator.dto;

import java.util.List;

public class CalculationResult2 {
    private List<Integer> calculation4;
    private Integer calculation5;
    private Double calculation6;

    public CalculationResult2(List<Integer> calculation4, Integer calculation5, Double calculation6) {
        this.calculation4= calculation4;
        this.calculation5 = calculation5;
        this.calculation6 = calculation6;
    }

    public List<Integer> getCalculation4() {
        return calculation4;
    }

    public Integer getCalculation5() {
        return calculation5;
    }

    public Double getCalculation6() {
        return calculation6;
    }
}
