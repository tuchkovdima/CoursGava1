package Mass.ObhodMassInObratnomPoriadke;

public class Main {
    public static void main(String[] args) {
        // если мы хотим вывести все слова наоборот
        String text = "где желает знать Каждый Каждый охотник сидит фазан";
        String[] coooloprs = text.split(", ?\\s+");

        // сравниваем последующее слово с предыдущим

        for (int i = 0; i< coooloprs.length; i++){
            if (i > 0 && coooloprs[i].equals(coooloprs[i-1])){ //если есть повторяющие элементы, они напечатаны не будут
                continue; // продолжаем цикл
            }
            System.out.println(coooloprs[i]);
        }


        for (int i = coooloprs.length - 1 ; i >= 0; i--){ //если нужен
            System.out.println(coooloprs[i]);
        }
    }
}
