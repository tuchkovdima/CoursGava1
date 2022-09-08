package IerarhiaCollection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur"); //вставляет
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("ddddd");
        System.out.println(stack);

        /*
        pop возвращает элемент, который находится вверху стека и сразу его удаляет
         */
        System.out.println(stack.pop());
        System.out.println(stack);

        for (int i = 0; i < stack.size(); i++) {
            if (!stack.isEmpty()){ //проверка пустой ли стек
                stack.pop();
            }
            else {
                break;
            }
        }
        System.out.println(stack);
    }
}
