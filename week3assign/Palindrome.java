package week3assign;


	public class Palindrome {

		public static void main(String[] args) {
			
			
	      String str="madam";
	      String rev=" ";
	      for(int i=str.length()-1;i>=0;i--)
	      {
	    	  rev+=str.charAt(i);
	      }
	      System.out.println("The palindrome string is " + rev);	
			
		}
		}

