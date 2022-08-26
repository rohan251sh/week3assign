package week3assign;

import java.util.HashMap;
import java.util.Set;

public class FindMostDuplicatenumber {
public static void main(String[] args) {
    String str = "abbaba";
    String s1 = str.replaceAll("\\s", "");
    // Converting given string to char array
    char[] c = s1.toCharArray();
    // Creating HashMap containing char as key and it's occurrences as value
    HashMap<Character, Integer> m = new HashMap<Character, Integer>();
    // Checking each character of c
    for (Character ch : c) {
        if (m.containsKey(ch)) {
            m.put(ch, m.get(ch) + 1);
        } else {
            m.put(ch, 1);
        }
    }
    // getting a set which containing all keys of m hashmap
    Set<Character> s = m.keySet();
    for (Character c1 : s) {
        if (m.get(c1) > 1) {
            System.out.println(c1 + "-->" + m.get(c1));
        }
    }
}
}