package fr.epita.java.demo.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal someBigDecimalValue = BigDecimal.valueOf(2.0);

        someBigDecimalValue = someBigDecimalValue.add(BigDecimal.ONE);

        assert someBigDecimalValue.equals(BigDecimal.valueOf(3.0));
    }
}
