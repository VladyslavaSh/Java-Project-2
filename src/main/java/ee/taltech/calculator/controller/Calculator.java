package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.Calculate1;
import ee.taltech.calculator.dto.Calculate2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static ee.taltech.calculator.controller.Calculation.*;

@RestController
public class Calculator {

    @GetMapping("calculate1")
    public Calculate1 calculate1(@RequestParam List<Integer> input) { return new Calculate1(input); }

    @GetMapping("calculate2")
    public Calculate2 calculate2(@RequestParam List<Integer> input) { return new Calculate2(input); }
}

