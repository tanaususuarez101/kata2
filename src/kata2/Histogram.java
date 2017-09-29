
package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {

    static Iterable<Object> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final int[] data;

    public int[] getData() {
        return data;
    }    
    
    public Histogram(int[] data) {
        this.data = data;
    }
    
    public Map getHistogram(){
        Map <Integer,Integer> histogram = new HashMap<>();
        for (int value : data) histogram.put(value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        return histogram;
    }
}
