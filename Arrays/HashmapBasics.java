package Arrays;

import java.util.HashMap;

public class HashmapBasics {
    static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("in","India");
        map.put("us","new york");
        map.put("uk","london");
        map.put("sw","amsterdam");
        System.out.println(map);
        System.out.println(map.getOrDefault("ln","none"));
        System.out.println(map);
    }
}
