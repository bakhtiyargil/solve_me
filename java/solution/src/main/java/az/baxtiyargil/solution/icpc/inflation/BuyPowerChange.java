package az.baxtiyargil.solution.icpc.inflation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BuyPowerChange {

    private static final int months = 10;
    private static BigDecimal boughtItem = BigDecimal.ZERO;
    private static final BigDecimal initialSalary = BigDecimal.valueOf(4346);
    private static BigDecimal lastPriceOfAllProduct = BigDecimal.valueOf(4346);

    public static void main(String[] args) {
        System.out.println("Answer: " + buyPowerChange(initialSalary, BigDecimal.ONE));
    }

    public static BigDecimal buyPowerChange(BigDecimal productCount, BigDecimal inflation) {
        for (int month = 1; month <= months; month++) {
            lastPriceOfAllProduct = lastPriceOfAllProduct.add(
                    lastPriceOfAllProduct.multiply(
                            inflation.divide(BigDecimal.valueOf(months * 100), 4, RoundingMode.HALF_EVEN)
                    ));
            BigDecimal lastPriceOfOneProduct = lastPriceOfAllProduct.divide(productCount, 4, RoundingMode.HALF_EVEN);
            boughtItem = boughtItem.add(initialSalary.divide(
                    lastPriceOfOneProduct,
                    4,
                    RoundingMode.HALF_EVEN));
        }
        return productCount.multiply(BigDecimal.valueOf(months)).subtract(boughtItem);
    }
}
