package week3assign;


import java.util.TreeMap;
public class FindSecondlargest {
	 public static void main(String[] args) {
            int b[] = {3,2,11,4,6,7,2,3,3,6,7};

            TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>();
            for(int i = 0; i<b.length;i++){
                tree.put(b[i], 0);
            }
            System.out.println(tree.floorKey(tree.lastKey()-1));
        }


   
}



