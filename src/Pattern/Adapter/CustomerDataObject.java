package Pattern.Adapter;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public class CustomerDataObject implements DataObject {
    private Customer customer;

    private  static long millisecondsInMonth = 30 * 24 * 3600 * 1000L;
    private static long milisecondsInYear = 365 * 24 * 3600 * 1000L;

    public CustomerDataObject(Customer customer){
        this.customer = customer;
    }

    public double getValue(String fieldName){
        switch (fieldName){
            case "callsPerMonth":
                return calculateCallsPerLastMonth();
            case "callsPerYear":
                return calculateCallsPerLastYear();
            case "minutesPerMonth":
                return calculateMinutesPerLastMonth();
            default:
                throw new IllegalArgumentException(
                        "Field" + fieldName + "doesn t exist"
                );
        }
    }
    private double calculateCallsPerLastMonth(){
        Date now = new Date();
        Date monthAgo = new Date(now.getTime() - millisecondsInMonth);
        return customer.getCallsCount((Data) now, (Data) monthAgo);
    }
    private double calculateCallsPerLastYear(){
        Date now = new Date();
        Date yearAgo = new Date(now.getTime() - milisecondsInYear);
        return customer.getCallsCount((Data)now, (Data)yearAgo);
    }
    private double calculateMinutesPerLastMonth(){
        Date now = new Date();
        Date monthAgo = new Date(now.getTime() - millisecondsInMonth);
        List<Call> calls = customer.getCalls((Data)now, (Data)monthAgo);
        int minutrs = 0;
        for (Call call : calls){
            minutrs += call.getDuration();
        }
        return customer.getCallsCount((Data)now, (Data)monthAgo);
    }
}
