package Files.ConfigurationFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
     //читаем данные
        Properties properties = new Properties();

        try {

            properties.load(new FileInputStream("lib/config.properties"));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(properties.getProperty("cashSize"));

     /**
     // записывали данные
        Properties properties = new Properties(); //основной формат конфигурации момтоит из ключей и значений
        properties.setProperty("timeout", "36000");
        properties.setProperty("cachSize", "10000");

        try {
            //пропертиес сохраняем в файл
       //    properties.store(new FileOutputStream("lib/config.properties",""));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
      **/
}
}