package Files;

import java.io.FileReader;

/**
public class BufferedReader {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Files/info.txt"));// читает сразу по строчно файл
            for (;;){
                String line = br.readLine();
                if(line == null){
                    break;
                }
                builder.append(line + "\n");// добавляем лайн в билдер
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println();
    }

}
*/