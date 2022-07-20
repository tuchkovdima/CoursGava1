package ProgrammCompany;

public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("407000002020304");
        Company company = new Company("Смарт - Экспресс", details);
        // some code
        details.setBillNumber("309030030300300");
        System.out.println(company);

        BankDetails copy = new BankDetails(
                details.getBillNumber(),
                details.getCorrespondenceBill(),
                details.getBikNumber(),
                details.getBankName(),
                details.getCity());
    }
}
