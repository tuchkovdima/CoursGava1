package FileOutPut.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class write {
    public static void main(String[] args) {
        try {
            ArrayList<String> strings = new ArrayList<>();
            for(int i = 0; i < 1000; i++){
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("data/file2.txt"),strings);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//csv -формат где все данные разделены ;