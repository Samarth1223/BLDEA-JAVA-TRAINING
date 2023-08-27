package TrainingCodes;

import java.util.Scanner;

public class CountOvels {

	public static void main(String[] args) {
		String str;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New String: ");
		str=sc.next();
		for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'|| str.charAt(i)=='A'
				|| str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
			count+=1;
		}
		}
		
		System.out.println("No of Vowels= "+ count);
	}

}
