package lessone10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text {
    public static void main(String[] args) {
        String text = "Abc Abc is mind is perfect is";
        Map<String, Integer> map = new HashMap<>();
        String[] parts = text.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (map.containsKey(parts[i])) {
                map.put(parts[i], map.get(parts[i]) + 1);
            } else {
                map.put(parts[i], 1);
            }

        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Word " + entry.getKey() + " - " + entry.getValue());

        }

    }
}
