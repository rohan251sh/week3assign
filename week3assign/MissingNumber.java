package week3assign;


	import java.util.Set;
	import java.util.TreeSet;

	public class MissingNumber {

		public static void main(String[] args) {
			 int[] data= {1,2,3,5,7,9,3};
			 Set<Integer>listvalues=new TreeSet<Integer>();
			 for(int i=0;i<data.length;i++)
			 {
				 listvalues.add(data[i]);
			 }
			 
			System.out.println("Numbers are :"+ listvalues); 

			 for(int i=0;i<data.length-1;i++)
		        {
		            if(data[i]+1!=data[i+1])
		            {
		                System.out.println("Missing number is :" + (data[i]+1));
		                break;
		            }
		        }
		}

	}
	


