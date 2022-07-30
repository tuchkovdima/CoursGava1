package Mass;

public class MassElements {
    public static void main(String[] args) {
        String[] colors = {"Red", "Yellow", "Black"};

        String text = "Every day arround order";
        String[] coooloprs = text.split(", ?\\s+");// метод возвращает массив


        for (int i = 0 ; i <colors.length;i++ ){
            System.out.println(colors[i]);
            System.out.println(coooloprs[i]);
        }
    }
}
