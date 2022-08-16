package Generics;

import java.util.ArrayList;
import java.util.List;


public class LRUcash<T> {
    ArrayList<T> elements;
    int size;

    public LRUcash(int size) { // конструктор
        this.size = size;
        elements = new ArrayList<>();
    }


    public void addElemtyn(T element) { //добавляем элемент в коллекцию
// проверяем не устарел ли наш элемеент
        int currenSize = elements.size(); // текущий размер
        if (currenSize >= size) {
            // Удалить  некоторое колличество элементов
            for (int i = 0; i <= currenSize - size + 1; i++) {
                elements.remove(0); // удаление самого первого элемента
            }
            elements.add(element);
        }
    }

    public T getElement(int i) { // поллучаем элемент вв нашу коллекцию
        if (i <= elements.size()) {
            return null;
        }
        return elements.get(i); // вернем  нужныый элкмент
    }

    public List<T> getAllEllements() { // полуучить все элементы коллекции
        return elements;
    }
}
