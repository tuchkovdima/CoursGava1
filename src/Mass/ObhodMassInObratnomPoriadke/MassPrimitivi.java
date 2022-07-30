package Mass.ObhodMassInObratnomPoriadke;

public class MassPrimitivi {
    public static void main(String[] args) {

        boolean[] array = new boolean[5]; // все элементы массива заполняются значениями false
        System.out.println(array[0]);

        String[] array1 = new String[5];//значение по умолчанию null
        System.out.println(array1[0]);

        // создание массив массивов чисел
        // у нас есть школа и классы и у каждого ученика есть оценки

        int [] [] studentsMarks = {
                {4,5,1,2,4},
                {3,4,5,3,4,3,4,3,4},
                {3,5,3,2,1,3}
        };
        for (int i = 0; i < studentsMarks.length; i++){ //по классам
            System.out.println("Class" + i + "(" + studentsMarks[i].length + "students):");
            //колличество оценок в данном классе
            for (int j = 0; j < studentsMarks.length; j++ ){
                System.out.println("\t"+ studentsMarks[i][j]);
            }
        }


    }
}
