package Mass.exempleChoose;

public class FirstExemple {
    public static void main(String[] args) {
        //сгенерировать номера лотырейных билетов
        int[] ticketNumber = new int[1000];
//каждый сотый элемент был выигрышным
        int[] winTickets = new int[10];

        for (int i = 0; i < ticketNumber.length; i++) {

            int value = 1000000 + (int) Math.round(1000000 * Math.random());
            ticketNumber[i] = value;
            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }
            // System.out.println(value);
        }
        for (int winTicketNumber : winTickets) {
            System.out.println(winTicketNumber);
        }
    }
}
