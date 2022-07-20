package BreakAndContinue;

public class BreakAndContinue2 {
    // проверка висакосных годов
    public static void main(String[] args) {
        int firstYear = 1922;
        int lastYear = 2022;

        for (int year = firstYear; year <= lastYear; year = year + 1) {

            if (year % 4 == 0) {
                continue; // переход к следующей итерации цикла
            }
            System.out.println(year);
            for (int mouth = 1; mouth <= 12; mouth = mouth + 1) {
                String zero = mouth < 10 ? "0" : "";
                System.out.println("29." + zero + mouth + "." + year);
            }
        }
    }
}
