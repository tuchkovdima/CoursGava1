package Pattern.Singnetor;

public class Connection { //позволяют создаапть объекты в единственном экземпляре и запрещают создание новых экземпляров этого класса

        private static volatile Connection instance;

    //  private static Connection instance = new Connection();
        private Connection(){}
        public static Connection getInstance(){ //метод создания экземпляра класса, а сам экземпляр хранится в статической переменной
//            if (instance == null){ //если не иницианолизированна
//                instance = new Connection();
//            }
            if (instance == null){
                synchronized (Connection.class){
                    if (instance == null){
                        instance = new Connection();
                    }
                }
            }
            return instance;
        }
    }

