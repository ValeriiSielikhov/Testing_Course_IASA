import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Proof {
    public static void main(String[] arg) {
        String str1 = "ANVIAMNMAI" ;         // input
        String str2 = count_func(str1);                     //str1.toUpperCase()
        System.out.println(str2);
    }

    static String count_func(String str1){
        HashMap<Character, Long> map = new HashMap<>();
        for(char i : str1.toCharArray()){
            long count = str1.chars().filter(ch -> ch == i).count();
            map.putIfAbsent(i , count);
        }
        ArrayList<String> arr = new ArrayList();
        for (char i: map.keySet()){
           arr.add(map.get(i).toString() +i);
        }
        Collections.sort(arr);
        String s= "";
        for(String i: arr) s += i;
        return s;
    }
}
