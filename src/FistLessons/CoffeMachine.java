package FistLessons;

public class CoffeMachine {
    public static void main(String[] args) {

        int milk = 3444;
        int coffe = 10;
        int skimmetMilk = 10; //обезжиренное молоко

        boolean isBlock = false; // блокирование кофемашины
        int cappucinoMilk = 5; //сколько молока нужно для приготовления капучино
        int capicinoCoffe = 6;

// закидываем сравнение в переменную
        boolean makeIsMilk = milk >= cappucinoMilk;
        boolean makeIsCoffe = coffe >= capicinoCoffe;

        boolean hasErrors = false;

        if (isBlock) {
            System.out.println("mashine Bloct");
            hasErrors = true;
        } else {
            if (makeIsMilk && makeIsCoffe) { // && = и
                System.out.println("make caputino");
            } else {
                System.out.println("not coffe");
            }
            if (!hasErrors) {
                System.out.println("make coffe");
            }
        }
    }
}
