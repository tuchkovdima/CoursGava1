import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//получаем данные из базы
//Hibernate нужна для того, чтобы преобразовывать записи базы данных в объекты java



public class FirstMain {
    public static void main(String[] args) {
        String url = "ldbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "root";

        try {
            // подключаемся к серверу май sql
            Connection connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();

            //как делать запросы которые не возвращают resultSet
            statement.execute("UPDATE Courses SET name = 'vvvvv WHERE id =1");

            ResultSet resultSet = statement.executeQuery("SELECT * FROME d");
            //перебирать спомощью цикла вайл

            while (resultSet.next()){

                //каждое поле добавлять не удобно, поэтому мы установим хибернейд
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));


                //по имени столбца получить поле
               String courseName = resultSet.getString("name");
                System.out.println(courseName);
            }
            connection.close();
            statement.close();
            resultSet.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
