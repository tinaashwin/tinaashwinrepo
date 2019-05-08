/**
 * 
 */

/**
 * @author Tina
 *
 */
public class PalindromeProgram {

	/**
	 * @param args
	 */
	
	/// main method 
	public static void main(String[] args) {
		
		Palindrome();  // calling of the static method Palindrome.

	}
	
	
	
	/// method to check whether the given string is palindrome or not.
	public static void Palindrome()
	{
		String word = "MADAM";
		String reverse = "";
		int len = word.length();
		
		for(int i = len-1; i >-1; i--)
		{
			reverse = reverse + word.charAt(i); /// reversing the string 
			
		}
		System.out.println("Reversed string is :" + reverse); // printing the reversed string.
		
		if(word.equals(reverse)) ///checks if the string and reversed string is same.
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}

	}

}
