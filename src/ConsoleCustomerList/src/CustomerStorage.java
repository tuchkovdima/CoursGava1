package ConsoleCustomerList.src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public boolean addCustomer(String data)
    {
        String[] components = data.split("\\s+");
        if (components.length !=4){
         throw new IllegalArgumentException("Wrong format.Correct fotmat: \n:" + "add Василий Петров \" +\n" +
                 "            \"vasily.petrov@gmail.com +79215637722");
        }
        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
        return true;
    }

    public void listCustomers() throws IOException {
     List<String> line = Files.readAllLines(Paths.get("file.txt")); //необработонное исключение chekt которое обязательно нужно обрабатывать
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}