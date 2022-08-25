package Pattern.Adapter;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    public int getCallsCount(Data from, Data to){
        return 0;
    }
    public List<Call>getCalls(Data from, Data to){
        return new ArrayList<Call>();
    }
}
