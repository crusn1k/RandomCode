package foo.bar;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, MyValue> myMap = new MyMap();
        MyValue val1 = new MyValue("x", 1);
        MyValue val2 = new MyValue("y", 2);
        myMap.put("a", val1);
        myMap.put("a", val2);
        System.out.println(myMap);
    }
}
