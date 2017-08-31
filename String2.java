import java.util.Scanner;

public class String2 {
  public static void main(String agrs[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the sentence");
	  String  n = sc.nextLine();
	  String word ="";
	  for(int i = 0 ; i <n.length();i++){
		  if(n.charAt(i)==' '){
			  String w = word;
			  word ="";
			  if(w.charAt(0)=='a'||w.charAt(0)=='e'||w.charAt(0)=='i'||w.charAt(0)=='o'||w.charAt(0)=='u'){
				  
			  }
		  }else{
			  word = word + n.charAt(i);
		  }
	  }
  }
}
