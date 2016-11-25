package tutorial;

public class Test {
	public static void main(String args[]) {
		   
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         System.out.print( x );
	         System.out.print(",");
	      }
	      System.out.print("\n");
	      String [] names = {"James", "Larry", "Tom", "Lacy"};

	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }
	     
	      Integer x = 5; // boxes int to an Integer object
	      x =  x + 10;   // unboxes the Integer to a int
	      System.out.println(x); 
	      
	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	      
	      String palindrome = "Dot saw I was Tod";
	      int len = palindrome.length();
	      System.out.println( "String Length is : " + len );
	   }
		
}
