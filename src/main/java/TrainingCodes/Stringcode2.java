package TrainingCodes;
//Program to Replace Vowels With Symbol '@' 


import java.util.Scanner;
public class Stringcode2 {

	public static void main(String[] args) {
		System.out.println("Enter the String1");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2="";
		System.out.println("Check");
		for(int i=0;i<=str1.length()-1;i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || 
					str1.charAt(i)=='o' || str1.charAt(i)=='u') {
				str2="@";
				
			}
			else {
				str2=""+str1.charAt(i);
				
			}
			System.out.print(str2);
		}
		

	}

}
