/**
 * 
 */

/**
 * @author ADMIN
 *
 */


import java.util.*;


public class StrOps {

	/**
	 * @param args
	 */
	
	static public String getString()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
		sc.close(); 

		return s;
	}
	
	
	static public void getVowels(int l, String s)
	{
		int noVowels=0;
		for(int j=0; j<=l; j++)
		{
			if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' )
			{
				noVowels++;
			}
		} 
		
		System.out.println(" No of vowels =" + noVowels);
	}
	
	
	public static void getWords(int l, String s)
	{
		int noWords=1;
		for(int j=0;j<=l; j++)
		{
			if(s.charAt(j) == ' ')
			{
				noWords++;
			}
		}
	System.out.println(" No of words="+ noWords);
		
	}
	
	public static void getReverse(int l, String s)
	{
		String reverse = " "; 
		for(int j=l; j>=0; j--)
		{
			reverse= reverse + s.charAt(j);
		}
		
		System.out.println(" Reverse =" + reverse);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	String str= getString();
	
	int len=str.length()-1;	
	getWords(len,str);
	getVowels(len,str);
	getReverse(len,str);

	}

	
}
