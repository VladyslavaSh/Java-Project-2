package ee.taltech.calculator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Operations {


    public static Optional<Integer> minOdd(List<Integer> input) {
        return input.stream().filter(x -> x % 2 != 0).min(Integer::compare);
    }

    public static Integer sumOfEven(List<Integer> input) {
        return input.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> odds(List<Integer> input) {
        return input.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }

    public static List<Integer> squared(List<Integer> input) {
        return input.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public static BigDecimal averageOfPositives(List<Integer> input) {
        double avg = input.stream().filter(x -> x >= 0).mapToDouble(x -> (double) x).average().orElse(0.0);
        return new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP);
    }
}
