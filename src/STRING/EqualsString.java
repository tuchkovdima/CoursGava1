package STRING;

public class EqualsString {
    public static void main(String[] args) {
        String managerName = "Vasily";
        String customerName = "Vasi".concat("ly");
        System.out.println(managerName.equals(customerName));

    }
}
