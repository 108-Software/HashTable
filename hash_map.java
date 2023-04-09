import java.util.Hashtable;
import java.util.*;

public class hash_map {

    public static void insert(Hashtable <Integer, String> hash, int key, String value ){
        hash.put(key, value);
    }

    public static void print(Hashtable <Integer, String> hash){
        for (Map.Entry m:hash.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void delete_by_key(Hashtable <Integer, String> hash, int key){
        hash.remove(key);
    }

    public static void key_to_value(Hashtable <Integer, String> hash, Integer key){
        if (hash.containsKey(key)) {
            for (Map.Entry m : hash.entrySet()) {
                if (m.getKey() == key) {
                    System.out.println(m.getValue());
                }
            }
        }else{System.out.println("Такого ключа нет в таблице");}

    }

    public static void values(Hashtable <Integer, String> hash){
        hash.size();
    }

    public static void delete_all(Hashtable <Integer, String> hash){
        hash.clear();
    }

}
