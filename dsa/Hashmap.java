import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("China", 150);
        map.put("BD", 20);
        map.put("India",120);
        System.out.println(map);
        map.put("BD",25);
        System.out.println(map);

        if(map.containsKey("BD")){
            System.out.println("key is find");

        }else{
            System.out.println("not find");
        }

        System.out.println(map.get("BD"));
        System.out.println(map.get("brazil"));

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        Set<String> keys=map.keySet();
        for(String key : keys){
            System.out.println(key +" "+map.get(key));
        }
    }
    
}
