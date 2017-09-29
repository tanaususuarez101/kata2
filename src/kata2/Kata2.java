package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
        int[]data = {1,1,1,2,2,0,0,1,2,0,1,1,1,2,2,2};
        Map <Integer,Integer> histogram = new HashMap<>();
        
        
        for (int value : data) histogram.put(value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        for(Object key : histogram.keySet()){
            System.out.println(key + " -> " + histogram.get(key) + " veces");
        }
        
    }
    private static void printf(Map hist){
        
    }
    
    
    
}
