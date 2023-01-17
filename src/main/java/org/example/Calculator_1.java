package org.example;

public class Calculator_1 {
    public Calculator_1() {
    }

    /**
     * Метод вычисления суммы покупки за вычетом скидки
     * @param purchaseAmount первоначальная сумма покупки
     * @param discountAmount процент скидки
     * @return итоговая сумма с вычетом скидки
     * discount - перевод процентного значения в сумму скидки
     */
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 | discountAmount < 0) {
            throw new ArithmeticException("Итоговая сумма не может быть отрицательной");
        }
        if (purchaseAmount == 0 | discountAmount == 0) {
            throw new ArithmeticException("Первоначальная стоимость или скидка не могут быть равны нулю");
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не должна быть более 99 процентов");
        }
        double discount = (purchaseAmount * discountAmount) / 100;
        return purchaseAmount - discount;
    }
}

