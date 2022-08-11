package Files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //свойства файлов
        File folder = new File("C:\\Users\\Dima\\Desktop\\CoursGava\\src\\Files");

        // создаем в папке еще 1 папку
        folder.mkdir();

        File [] files = folder.listFiles();

        for (File file: files){
            System.out.println(file.getAbsolutePath()); // все папки и файлы, которые есть внутри нашей папки
        }




        System.out.println(folder.length()); // длина файла
        System.out.println(folder.lastModified());// последняя дата и время изменения в милисекундах
      //  System.out.println(file.delete()); // удаление файла
        System.out.println(folder.isDirectory()); // получаем все файлы в папке


    }
}
