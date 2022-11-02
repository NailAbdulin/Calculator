package service;

import exeption.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ServiceCalculator {
    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if(b == 0) throw new DivideByZeroException("Делить на ноль нельзя!");
        return (double) a / b;
    }
}
