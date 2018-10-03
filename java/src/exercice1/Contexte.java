package exercice1;
import java.util.HashMap;

public class Contexte {
    public Contexte() {
        this.map = new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> map;

    public void addMapValue(String valname, int value) {
        if(this.map.containsKey(valname)){
            this.map.replace(valname, value);
        }
        else {
            this.map.put(valname, value);
        }
    }

    public int getValue(String k) {
        return map.get(k);
    }
}
