package Pattern.Adapter;

import javax.xml.crypto.Data;

public class Call {
    private int duration;
    private Data time;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Data getTime() {
        return time;
    }

    public void setTime(Data time) {
        this.time = time;
    }

    public Call(int duration, Data time) {
        this.duration = duration;
        this.time = time;
    }




}
