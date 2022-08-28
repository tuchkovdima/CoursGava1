import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();// создание окна
        frame.setSize(600,400); //размер окна

//        //добавление кнопки
//        frame.setLayout(new FlowLayout());
//        frame.add(new JButton("Cleck me"));

        frame.add(new MainForm().getMainPanel());//тогда фрейм будет содержать панель

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//завершение программы при закрытии окна

        frame.setLocationRelativeTo(null);//чтобы окно отображалось по центру
        frame.setVisible(true); //видимое окно
    }
}
