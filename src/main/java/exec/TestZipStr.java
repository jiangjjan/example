package exec;

import java.math.BigDecimal;

public class TestZipStr{
    public static void main(String[] args) {
        double x = 0.01;
        double y = 0.05;
        BigDecimal xNumber = BigDecimal.valueOf(x);
        BigDecimal yNUmber = BigDecimal.valueOf(y);
        System.out.println(xNumber.add(yNUmber));
    }
}