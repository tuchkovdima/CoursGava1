package Mass;

public class Mass {
    public static void main(String[] args) {
        //колличество комнат на каждом этаже здания
        int[] roomCounts = new int[6];
        int[] roomConts2 = {4,5,6};


        roomCounts[0] = 5;
        roomCounts[1] = 45;
        roomCounts[2] = 33;
        roomCounts[3] = 22;
        roomCounts[4] = 10;
        roomCounts[5] = 22;

        for (int i = 0; i < roomCounts.length; i++){

            System.out.println(roomConts2[i]);
            System.out.println(roomCounts[i]);
        }
    }
}
