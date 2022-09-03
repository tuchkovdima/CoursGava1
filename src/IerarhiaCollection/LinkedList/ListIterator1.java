package IerarhiaCollection.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        /*
        Можно работать с предыдущим элементом

        полендром это строки, которые читаются и справа на лево, и с лева на право
         */
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for (char ch : s.toCharArray()) { //string преобразуем в пассив char
            list.add(ch);
        } //m, a, d, a, m
        ListIterator iterator = (ListIterator) list.listIterator(); // с 0
        ListIterator reversIterator = (ListIterator) list.listIterator(list.size());// с 5 позиции

        boolean isPalindrome = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()) {
            if (iterator.next() != reversIterator.previous()) {
                isPalindrome = false;
                break;
            }
            if (isPalindrome) {
                System.out.println("palindrome");
            } else {
                System.out.println("not");
            }
        }

    }
}
