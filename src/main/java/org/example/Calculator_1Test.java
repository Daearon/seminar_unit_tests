//package org.example;
//
//import org.assertj.core.api.Assertions;
//
//import static org.example.Calculator_1.calculateDiscount;
//
//public class Calculator_1Test {
//    public Calculator_1Test() {
//    }
//
//    public static void main(String[] args) {
//        Assertions.assertThat(calculateDiscount(100, 20)).isEqualTo(80);
//        Assertions.assertThatExceptionOfType(ArithmeticException.class)
//                .isThrownBy(() -> calculateDiscount(100, -10))
//                .withMessageContaining("Итоговая сумма не может быть отрицательной");
//        Assertions.assertThatExceptionOfType(ArithmeticException.class)
//                .isThrownBy(() -> calculateDiscount(-10, 99))
//                .withMessageContaining("Итоговая сумма не может быть отрицательной");
//        Assertions.assertThatExceptionOfType(ArithmeticException.class)
//                .isThrownBy(() -> calculateDiscount(100, 0))
//                .withMessageContaining("Первоначальная стоимость или скидка не могут быть равны нулю");
//        Assertions.assertThatExceptionOfType(ArithmeticException.class)
//                .isThrownBy(() -> calculateDiscount(0, 100))
//                .withMessageContaining("Первоначальная стоимость или скидка не могут быть равны нулю");
//        Assertions.assertThatExceptionOfType(ArithmeticException.class)
//                .isThrownBy(() -> calculateDiscount(100, 112))
//                .withMessageContaining("Скидка не должна быть более 99 процентов");
//        Assertions.assertThat(calculateDiscount(100.5, 20)).isEqualTo(80.4);
//    }
//}
