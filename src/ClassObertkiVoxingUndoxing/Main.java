package ClassObertkiVoxingUndoxing;

public class Main {
    private static int MAX_AGE = 8;

    public static void main(String[] args) {
        System.out.println(Double.MIN_VALUE);

        //Boxing примитива
        Integer vasyaAge = 6;
        Integer mishaAge = vasyaAge;
        vasyaAge = 7;
        System.out.println(mishaAge);
        System.out.println(vasyaAge == mishaAge);

        //unboxing
        Double value = 6.0;
        double sum = 0;
        sum = sum + value;

        Integer ivanAge = 6;
        if (ivanAge <= MAX_AGE){
            System.out.println("text");
        }

        Integer width = 76;
        Integer height = 85;
        System.out.println(calculateRecangleArea(width, height));

    }

    public static int calculateRecangleArea (int width, int height){
        return width * height;
    }
}
