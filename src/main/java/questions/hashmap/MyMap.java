package questions.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    private Map<Integer, String> map = new HashMap<>();
    private boolean isSetToDefault;
    private String defaultValue;

    public MyMap() {
    }

    public void setKeyValue(Integer key, String value) {
        this.map.put(key, value);
    }

    public String getValue(Integer key) {
        if (isSetToDefault)
            return this.defaultValue;

        return this.map.get(key);
    }

    public void setAll(String value) {
        this.defaultValue = value;
        this.isSetToDefault = true;
    }
}
