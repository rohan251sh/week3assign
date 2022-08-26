package week3assign;


	
	import java.util.Arrays;
	import java.util.LinkedHashSet;
	 
	public class RemoveDuplicatewords{
	 
	    public static void main(String[] args) {
	        
	        String str = 
	            "We learn java basics as part of java sessions in java week1";
	        
	        System.out.println("Original String: ");
	        System.out.println(str);
	        
	        /*
	         * Since the words are separated by space,
	         * we will split the string by one or more space
	         */
	        
	        String[] strWords = str.split("\\s+");
	        
	        //convert String array to LinkedHashSet to remove duplicates
	        LinkedHashSet<String> lhSetWords 
	            = new LinkedHashSet<String>( Arrays.asList(strWords) );
	        
	        //join the words again by space
	        StringBuilder sbTemp = new StringBuilder();
	        int index = 0;
	        
	        for(String s : lhSetWords){
	            
	            if(index > 0)
	                sbTemp.append(" ");
	        
	            sbTemp.append(s);
	            index++;
	        }
	        
	        str = sbTemp.toString();
	        
	        System.out.println("String after removing duplicate words: ");
	        System.out.println(str);
	 
	    }
	}


