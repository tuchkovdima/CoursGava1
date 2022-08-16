package StatusGonokAndCriticalSection;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            new Thread(()-> {
                for (int j = 0; j < 10; j++){
                    VaiueStorage.incrementValue();
                }
                System.out.println(VaiueStorage.getValue());
            }).start();
        }
    }
}
