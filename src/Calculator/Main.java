package Calculator;

import ProgrammProduct.Product;

//объекты и примитивы отличаются тем, что в объектах ссылки, а примитивах простые значения
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("milk", 78);
        Product product2 = new Product("icekream", 60);
        Calculator calculator = getCalculator(5,10,15);
      //  addComition(milkPrice);
        System.out.println(calculator.multyply());
    }
    public static Calculator getCalculator (int a, int b, int c) {
        Calculator calculator = new Calculator(a,b,c);
        return calculator;

    }
    public static void addComition(int price){
        price= price + 10;
    }
}
