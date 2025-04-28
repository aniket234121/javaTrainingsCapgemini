package Collections.mapExample;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            System.out.println(key+":"+map.get(key));
        }
    }
}
