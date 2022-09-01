import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileAllTwo {
    private static final String INPUT = "data/file.txt";
    private static final String INPUT2 = "data/file2.txt";
    private static final List<Character> chars = new ArrayList<>();
    private static char y;
    public void read()
    {
        BufferedReader reader = null;
        BufferedReader reader2 = null;
        try
        {
            reader = new BufferedReader(new FileReader((INPUT)));
            reader2 = new BufferedReader(new FileReader((INPUT2)));

            int c;
            int u;
            while ((c = reader.read()) != -1)
            {
                chars.add((char) c);
            }
            while ((u = reader2.read()) != -1)
            {
                y = (char) u;
            }

            reader.close();
            reader2.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (reader != null && reader2 != null)
            {
                try
                {
                    reader.close();
                    reader2.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(chars);
        System.out.println(y);
    }
    public static void ebal() throws FileNotFoundException {
        Scanner s2 = new Scanner(new FileReader(INPUT2));
        int symble = s2.nextInt();


        for (int j = 0; j < chars.indexOf(y); j++) {

            if (chars.get(j) == '!'){
                 chars.set(j, '@');
            }

        }

        System.out.println(chars);
    }
}
