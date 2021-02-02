
import java.util.Scanner;

public class Analyze {

	static String value;
	/*Analyze()
	{
		this.value=value;
		
	}*/
	
	static public int compareTo(String anotherString,String value)
	{
		int len1 = value.length();
		int len2 = anotherString.length();
		int lim = Math.min(len1, len2);
		//char v1[]=value.toCharArray();
		
		char v1[] = new char[len1];
 		for(int i=0;i<len1;i++)
 			 v1[i]=value.charAt(i);
 		
 		char v2[] = new char[len2];
 		for(int i=0;i<len2;i++)
 			 v2[i]=anotherString.charAt(i);
		//char v2[] = anotherString.toCharArray();
 		
 		//System.out.println("Not inbuilt method");
		int k=0;
		while(k<lim)
		{
			char c1 = v1[k];
			char c2 = v2[k];
			if(c1!=c2)
			{
				
				return c1 - c2;
			}
			k++;
		}
		
		return len1-len2;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first string:");
		String str1=s.next();
		Analyze a= new Analyze();
		
		System.out.println("Enter the second string:");
		String str2=s.next();
		
		int value= compareTo(str1,str2);
		
		System.out.println("Value without inbuilt function :"+value);
		s.close();
	}

}
