package solution;

import java.util.*;

public class HashTable {
    Map<Integer, ArrayList<Object>> table = new TreeMap<Integer, ArrayList<Object>>();

    public boolean hasObject(Object o){
        var hash = o.hashCode();
        var bucket = table.getOrDefault(hash, new ArrayList<Object>());
        return bucket.contains(o);
    }

    public void addObject(Object o){
        var contains = hasObject(o);
        if (!contains) {
            var hash = o.hashCode();
            var bucket = new ArrayList<Object>();
            bucket.add(o);
            table.put(hash, bucket);
        }
    }

    public void deleteObject(Object o){
        var contains = hasObject(o);
        if (contains) {
            var hash = o.hashCode();
            var bucket = table.get(hash);
            bucket.remove(o);
            table.put(hash, bucket);
        }
    }

}
