package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
        int[]data = {1,1,1,2,2,0,0,1,2,0,1,1,1,2,2,2};
        Map <Integer,Integer> hist = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(!hist.containsKey(data[i]))  hist.put(data[i], 1);            
            else  hist.put(data[i], hist.get(data[i]) +1 );            
            
        }
        System.out.println(hist.toString());
        for(Object key : hist.keySet()){
            System.out.println(key + " -> " + hist.get(key) + " veces");
        }
        
    }
    private static void printf(Map hist){
        
    }
    
    
    
}
