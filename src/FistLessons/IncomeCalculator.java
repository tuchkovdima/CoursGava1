package FistLessons;

import java.util.Scanner;

public class IncomeCalculator {
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 14000;
    private static int telephonyCharge = 12000;
    private static int  internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;


    public static void main(String[] args) {

        while (true){
            System.out.println("summa doxodov company at mounth" + "ot 200 at 900K Rub");

            int icome = (new Scanner(System.in)).nextInt();

            if (!checkIncomeRange(icome)){
                continue;
            }
            double managerSalary = icome * managerPercent;
            double pureIncome = icome - managerSalary - calculateFixedCharges();
            double taxAnount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome- taxAnount;

            boolean canVakeInvestments = pureIncomeAfterTax >= minInvestmentsAmount;

            System.out.println("Zarplata manager" +  managerSalary);
            System.out.println("summa nalogov" + (taxAnount > 0 ? taxAnount : 0));
            System.out.println("Company to investition" + (canVakeInvestments ? "Yes" : "No"));
            if (pureIncome<0) {
                System.out.println("money in negative");
            }
        }
    }
    private static boolean checkIncomeRange(int income)
    {
        if (income < minIncome){
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }
    private static int calculateFixedCharges(){
        return officeRentCharge + telephonyCharge + internetAccessCharge + assistantSalary + financeManagerSalary;
    }
}

