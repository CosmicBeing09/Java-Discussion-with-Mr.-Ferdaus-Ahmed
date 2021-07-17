package java_discussion_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Raihan");
        map.put(102, "Nazia");
        map.put(103, "Munif");


        System.out.println(map.get(103));

//        Set<Map.Entry<Integer, String>> set = map.entrySet();

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<String, HashMap<String, String>> attribute = new HashMap<>();

        HashMap<String, String> data = new HashMap<>();

        data.put("title", "fefadfdf");
        data.put("description", "ieriejrienfioe");
        data.put("data", "fefe5965499");

        attribute.put("attribute", data);


    }
}
