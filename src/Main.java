import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "Bai nay co ve kho nhung thuc ra khong kho";
        String lowerString = string.toLowerCase();
        String[] array = lowerString.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        String key;
        Integer value;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                value = map.get(array[i]) + 1;
                map.remove(array[i]);
                map.put(array[i], value);
            } else {
                map.put(array[i], 1);
            }
        }
        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}