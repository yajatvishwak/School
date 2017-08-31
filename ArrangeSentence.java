import java.util.Scanner;

public class ArrangeSentence {
 public static void main(String agrs[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the sentence");
	 String s = sc.nextLine();
	 char last = s.charAt(s.length()-1);
	 if(last!= '.'){
		 System.out.println("Sandwich");
	 }else{
		 String n[] = s.split(" ");
		 int index1 = n.length;
		 int[] numLen = new int[index1];
		 for(int i = 0 ; i<index1;i++){
			 numLen[i] = n[i].length();
			 
		 }
		 
		 for (int i = 0; i < numLen.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < numLen.length; j++)
	                if (numLen[j] > numLen[index]) 
	                    index = j;
	      
	            int smallerNumber = numLen[index];
	            String smallerString = n[index];
	            numLen[index] = numLen[i];
	            n[index] = n[i];
	            numLen[i] = smallerNumber;
	            n[i] = smallerString;
	        }
		 for(String x: n){
			 System.out.print(x+" ");
		 }
		 
	 }
 }
}
