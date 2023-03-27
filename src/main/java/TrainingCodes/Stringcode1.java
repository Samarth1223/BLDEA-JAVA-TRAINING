//Program to count number of words in a sentence

package TrainingCodes;
import java.util.Scanner;
import java.util.Scanner;
public class Stringcode1 {

  public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Sentence: ");
			String str1 =sc.nextLine();
			int wordcount=0;
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)== ' ') {
					wordcount++;
				}
			}
			wordcount++;
			System.out.println("The no of Words in a Sentence are: " + wordcount);
		}
   }
}