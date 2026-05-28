package school.hei.com.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {
    private void validatePositiveNumbers(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                    "Only positive numbers are allowed"
            );
        }
    }

    public double add(double a, double b) {
        validatePositiveNumbers(a, b);
        return a + b;
    }

    public double subtract(double a, double b) {
        validatePositiveNumbers(a, b);
        return a - b;
    }

    public double multiply(double a, double b) {
        validatePositiveNumbers(a, b);
        return a * b;
    }

    public double divide(double a, double b) {
        validatePositiveNumbers(a, b);
        if (b == 0) {
            throw new IllegalArgumentException(
                    "Division by zero is not allowed"
            );
        }
        return a / b;
    }
}
