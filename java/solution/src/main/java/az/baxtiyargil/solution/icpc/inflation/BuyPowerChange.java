package az.baxtiyargil.solution.icpc.inflation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BuyPowerChange {

    private static final int months = 10;
    private static BigDecimal buyPower = BigDecimal.ZERO;
    private static final BigDecimal initialSalary = BigDecimal.valueOf(4346);
    private static final BigDecimal initialInflation = BigDecimal.ONE;

    public static void main(String[] args) {
        System.out.println("Answer: " + buyPowerChange(initialSalary, initialInflation));
    }

    public static BigDecimal buyPowerChange(BigDecimal salary, BigDecimal inflation) {
        for (int month = 1; month <= months; month++) {
            buyPower = buyPower.add(salary.divide(inflation.divide(
                            inflation.add(
                                    BigDecimal.valueOf(month).divide(BigDecimal.valueOf(1000), 4, RoundingMode.HALF_EVEN)
                            ),
                            4,
                            RoundingMode.HALF_EVEN),
                    4,
                    RoundingMode.HALF_EVEN));
        }
        return buyPower.subtract(salary.multiply(BigDecimal.valueOf(months)));
    }
}
