package SpiskiElementov;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Динамический список список дел
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("First unit"); // добавление нового элемента
        todoList.add(0, "Second unit"); // указать на какое место эту строку поставить

        for (String items : todoList) {
            System.out.println(items);
        }
        for (int i = 0; i < todoList.size(); i++) { //печатаем lengh-у массивов у ArrayList - size() размер списка

            System.out.println(todoList.get(i));
        }
        //короткая запись
        ArrayList<String> done = new ArrayList<>() {{
            add("First");
            add("sec");
        }};
        done.add("tree");
        done.remove(0); // удаление

        for (int r = 0; r < done.size(); r++) {
            System.out.println(done.get(r));

        }


    }
}
