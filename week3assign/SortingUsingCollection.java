package week3assign;


	import java.util.*;
	 
	public class SortingUsingCollection
	{
	    public static void main(String[] args)
	    {
	        // Create a list of strings
	        ArrayList<String> al = new ArrayList<String>();
	        al.add("Aspire Systems");
	        al.add("CTS");
	        al.add("HCL");
	        al.add("Wipro");
	        
	 
	        /* Collections.sort method is sorting the
	        elements of ArrayList in ascending order. */
	        Collections.sort(al, Collections.reverseOrder());
	 
	        // Let us print the sorted list
	        System.out.println("List after the use of" +
	                           " Collection.sort() :\n" + al);
	    }
	}


