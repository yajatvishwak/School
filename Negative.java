import java.util.Scanner;

public class Negative {
public static void main(String agrs[]){
	Scanner sc = new Scanner(System.in);
	while(true){
		System.out.println("Enter the sentence");
		String s = sc.nextLine();
		int index = s.indexOf("is");
		index +=2;
		String a = s.substring(0,index);
		a = a + " is not ";
		index += 6;
		String b = s.substring(index);
		System.out.println(a+b);
	}
}
}
