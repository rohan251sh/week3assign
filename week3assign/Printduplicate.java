package week3assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Printduplicate {
   public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,3,6,8,29,1,2,4,7,8));
      HashSet<Integer> hCheckSet = new HashSet<Integer>();
      HashSet<Integer> hTargetSet = new HashSet<Integer>();
      for (Integer integer : arr) {
         if(!hCheckSet.add(integer)) {
            hTargetSet.add(integer);
         }
      }
      System.out.println("Duplicate integers in given list is/are " + hTargetSet);
   }
}
