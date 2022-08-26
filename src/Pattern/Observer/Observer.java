package Pattern.Observer;

public interface Observer {
    void update();

    void add(Observer observer);

    void remove(Observer observer);
}
