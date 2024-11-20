import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();
        
        // Adding key-value pairs
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Scala");
        
        // Accessing a value using its key
        System.out.println("Value for key 2: " + map.get(2));
        
        // Iterating over the map
        System.out.println("Iterating over the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Removing an entry
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        
        // Checking if a key or value exists
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'Scala'? " + map.containsValue("Scala"));
        
        // Size of the map
        System.out.println("Map size: " + map.size());
    }
}
