package Deadlock;

public class Friend implements Comparable<Friend> {
    private final String name;

    public Friend(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public  void throwBallTo(Friend catcher){
        System.out.format("%s: %s кинул мне мяч!%n", catcher.getName(), this.name);
        synchronized (compareTo(catcher)>0 ? catcher : this) { //блок по объекту который меньше
            catcher.throwBallTo(this);
        }
    }
    @Override
    public int compareTo(Friend o) {
        return this.getName().compareTo(o.getName());
    }
}
