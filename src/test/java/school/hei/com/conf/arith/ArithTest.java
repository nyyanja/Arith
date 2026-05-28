package school.hei.com.conf.arith;
import org.junit.jupiter.api.Test;
import school.hei.com.service.ArithService;

import static org.junit.jupiter.api.Assertions.*;

class ArithTest {
    ArithService arithService = new ArithService();
    @Test
    void should_add_two_positive_numbers() {
        assertEquals(8, arithService.add(5, 3));
    }
    @Test
    void should_add_zero_and_positive_number() {
        assertEquals(5, arithService.add(0, 5));
    }
    @Test
    void should_add_two_zeros() {
        assertEquals(0, arithService.add(0, 0));
    }
    @Test
    void should_add_large_numbers() {
        assertEquals(2000000, arithService.add(1000000, 1000000)
        );
    }
    @Test
    void should_add_decimal_numbers() {
        assertEquals(5.7, arithService.add(2.5, 3.2)
        );
    }
    @Test
    void should_handle_small_decimal_numbers() {
        assertEquals(0.3, arithService.add(0.1, 0.2), 0.0001
        );
    }
    @Test
    void should_throw_exception_when_first_number_is_negative() {
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> arithService.add(-5, 3)
        );
        assertEquals("Only positive numbers are allowed", exception.getMessage()
        );
    }
    @Test
    void should_throw_exception_when_both_numbers_are_negative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> arithService.add(-5, -3));
        assertEquals("Only positive numbers are allowed", exception.getMessage());
    }

    @Test
    void should_subtract_two_numbers() {
        assertEquals(6, arithService.subtract(10, 4));
    }
    @Test
    void should_subtract_with_zero() {
        assertEquals(10, arithService.subtract(10, 0));
    }
    @Test
    void should_return_zero_when_same_numbers() {
        assertEquals(0, arithService.subtract(5, 5));
    }
    @Test
    void should_throw_exception_when_subtracting_negative_numbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> arithService.subtract(-10, 5));
        assertEquals("Only positive numbers are allowed", exception.getMessage());
    }

    @Test
    void should_multiply_two_numbers() {
        assertEquals(12, arithService.multiply(3, 4));
    }
    @Test
    void should_multiply_by_zero() {
        assertEquals(0, arithService.multiply(0, 10));
    }
    @Test
    void should_multiply_large_numbers() {
        assertEquals(1000000, arithService.multiply(1000, 1000));
    }
    @Test
    void should_multiply_decimal_numbers() {
        assertEquals(7.5, arithService.multiply(2.5, 3));
    }
    @Test
    void should_throw_exception_when_multiplying_negative_numbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> arithService.multiply(-2, 5));
        assertEquals("Only positive numbers are allowed", exception.getMessage());
    }

    @Test
    void should_divide_two_numbers() {
        assertEquals(5, arithService.divide(10, 2));
    }
    @Test
    void should_return_decimal_result() {
        assertEquals(2.5, arithService.divide(5, 2));
    }
    @Test
    void should_divide_zero_by_number() {
        assertEquals(0, arithService.divide(0, 5));
    }
    @Test
    void should_throw_exception_when_dividing_by_zero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> arithService.divide(10, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
    @Test
    void should_throw_exception_when_dividing_negative_number() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> arithService.divide(-10, 2));
        assertEquals("Only positive numbers are allowed", exception.getMessage());
    }
}