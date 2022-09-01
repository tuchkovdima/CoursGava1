
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileAll
    {
        private static final String INPUT = "data/file.txt";
        private static final String INPUT2 = "data/file2.txt";

        private static final List<Character> chars = new ArrayList<>();
        public void read()
        {
            BufferedReader reader = null;
            try
            {
                reader = new BufferedReader(new FileReader((INPUT)));

                int c;
                while ((c = reader.read()) != -1)
                {
                    chars.add((char) c);
                }

                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (reader != null)
                {
                    try
                    {
                        reader.close();
                    } catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(chars);
        }

        public void replace() throws FileNotFoundException {
            Scanner s2 = new Scanner(new FileReader(INPUT2));
        //    Scanner scanner = new Scanner(System.in);
            int w = s2.nextInt(); // считанное из файл 2 число

            for (int i = 0; i <= w ; i++) {
                if(chars.get(i) == '!'){ //получает get
                    chars.set(i, '*');//заменяет set
                }
            }
            System.out.println(chars);

        }
    }
