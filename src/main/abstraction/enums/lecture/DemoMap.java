package main.abstraction.enums.lecture;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    Map<String, String> map = new HashMap<>();

    void store(String key, String obj) {
        this.map.put(key, obj);
    }
    
}
