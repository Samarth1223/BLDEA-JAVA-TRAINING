package TrainingCodes;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		//Step-1
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter teh string:");
		 String str = sc.nextLine();
		 
		 //Step-2
		 int count=0;
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)==' ' || i==str.length()-1) {
				 count++;
			 }
		 }
		 System.out.println("Word Count:"+ count);
		 
		 //Step-3
		 String arr[] = new String[count];
		 int tmp=0;
		 //Step-4
		 for(int i=str.length()-1;i>=0;i--) {
			 //Step-5
			 if(str.charAt(i)!=' ')
		 }
		
	}
}