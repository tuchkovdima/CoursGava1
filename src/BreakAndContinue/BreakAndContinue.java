package BreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        int soughYear = 1985; // текущий год

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExist = false;
        for (int year = firstYear; year <= lastYear; year = year + 1) {
            System.out.println(year);
            if (year == soughYear) {
                System.out.println(year + "year OPEN");
                yearExist = true;
                break;
            }

        }
        String found = "Open";
        String notFound = "Close";
        System.out.println(yearExist ? found : notFound);
    }
}
