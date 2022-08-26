package week3assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintuniqueCharacter {
    
   
    	public static void main(String[] args) {
    	    String txt = "abccddeee";
    	    Set<Character> uniqueStr = new HashSet<Character>();
    	    for (int i = 0; i < txt.length(); i++) {
    	        uniqueStr.add(txt.charAt(i));
    	    }
    	    System.out.println(uniqueStr);
    	}
}

