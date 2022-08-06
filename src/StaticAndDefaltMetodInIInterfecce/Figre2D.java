package StaticAndDefaltMetodInIInterfecce;
// метод доступен в классах наследниках

public interface Figre2D {
        default Double gerSquare(){
            return  0.0;
    }
}
