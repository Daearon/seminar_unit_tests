package seminars.third;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminar3.SomeService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @ParameterizedTest
    @CsvSource({
            "2000, 10, 1800",
            "4000, 50, 2000",
            "2000, 100, 0",
            "2000, 0, 2000"
    })
    void calculatingDiscountNormalPatternTest(double purchaseAmount, int discountAmount, double expected) {

        assertThat(someService.calculatingDiscount(purchaseAmount, discountAmount))
                .isEqualTo(expected); // обычная скидка
    }

    @ParameterizedTest
    @CsvSource({
            "2000, 110",
            "2000, -10"
    })
    void incorrectDiscountPatternTest(double purchaseAmount, int discountAmount) {

        assertThatThrownBy(() ->
                someService.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void negativeDiscountPatternTest() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }

    @Test
    void enterEvenNumberPatternTest() {

        assertTrue(someService.evenOddNumber(6));
    }

    @Test
    void enterOddNumberPatternTest() {

        assertFalse(someService.evenOddNumber(7));
    }

    @Test
    void enterNumberInIntervalPatternTest() {

        assertTrue(someService.numberInIntervalOrNot (42));
    }
    @Test
    void enterNumberBeyondIntervalPatternTest() {

        assertFalse(someService.numberInIntervalOrNot (12));
    }
}
