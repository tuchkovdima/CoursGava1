package ConditionProgramm;

public class TimeMilles {

    public static final double epsilon = 0.000000001; // погрешность


    public static void main(String[] args) {
        //long now = System.currentTimeMillis();
        //int seconds = (int) (now / 100); // 1 января 1970 года
        //System.out.println(seconds);

        double value1= 2.0 - 1.1;
        double value2 = 0.9;
        boolean comparison = Math.abs(value1 - value2)< epsilon;
        System.out.println(comparison);
    }

}
