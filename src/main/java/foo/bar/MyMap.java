package foo.bar;

import java.util.HashMap;


class MyMap extends HashMap<String, MyValue> {
    @Override
    public MyValue put(String key, MyValue value){
        if(super.containsKey(key)){
            MyValue currentValue = super.get(key);
            if(currentValue.getRevision() < value.getRevision()){
                return super.put(key, value);
            }
            return currentValue;
        }
        return super.put(key, value);
    }
}
