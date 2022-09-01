import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {

//
//        FileAll input = new FileAll();
//        input.read();
//
//        input.replace();
//
        FileAllTwo input = new FileAllTwo();
        input.read();
        FileAllTwo.ebal();

    }
}

//List<String> list = Files.readAllLines(Path.of(имя файла)); из файла сразу запехнуть элементы в список
