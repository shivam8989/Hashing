package HASHING;
import java.util.HashMap;
public class Hashmap {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        // insert
        hm.put("India",78);
        hm.put("Pakistan",45);
        hm.put("us",56);
        System.out.println(hm);
        // search
        int population = hm.get("India");
        System.out.println("The population of India is "+population);
        System.out.println(hm.containsKey("us"));
        System.out.println(hm.containsValue(78));
        //remove opearation
        System.out.println( hm.remove("Pakistan"));
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
