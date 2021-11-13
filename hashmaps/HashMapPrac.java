import java.util.Set;
import java.util.HashMap;

public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("saeed@gmail.com", "Saeed G");
        userMap.put("ali@gmail.com", "Ali G");
        userMap.put("sohail@gmail.com", "Sohail G");

        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            //gets all the values of the keys
            System.out.println(userMap.get(key)); 
        }
    }
}


