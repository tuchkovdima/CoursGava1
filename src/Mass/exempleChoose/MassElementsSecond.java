package Mass.exempleChoose;

public class MassElementsSecond {
    public static void main(String[] args) {
        String text = "Every day arround order";
        String[] coooloprs = text.split(", ?\\s+");// метод возвращает массив

        for (String colorWord : coooloprs) { // применима тогда, ккогда нам не нужен номер элемента в массиве
            System.out.println(colorWord);
        }
        for (int i = 0; i < coooloprs.length; i++){ //если нужен
            System.out.println(coooloprs[i]);
        }
    }
}
