package BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("6343423543654365424235436");
        BigInteger integer2 = new BigInteger("63434235436543654242354356");
        integer = integer.add(integer);
        System.out.println(integer);
        System.out.println(integer.compareTo(integer2));//сравнение
    }
}
