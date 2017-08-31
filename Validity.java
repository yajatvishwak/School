import java.util.Scanner;

public class Validity {
public static void main(String agrs[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Sentence");
	String n = sc.nextLine();
	n = n.toUpperCase();
	int f = 0;
	for(int i = 0 ; i < n.length();i++){
		if(n.charAt(i)=='(' || n.charAt(i)==')'){
			f++;
		}
		
	
		
	}
	if(f%2 !=0){
		
		System.out.println("INVALID STRING");
		System.exit(0);
	}
	int index = n.indexOf('(');
	int index1 = n.indexOf(')');
	String newStr = n.substring(0,index) + n.substring(index1+1);
//	System.out.println(newStr);
	f=0;
	for(int i = 0 ; i < n.length();i++){
		if(n.charAt(i)=='(' || n.charAt(i)==')'){
			f++;
		}
		
	
		
	}
	if(f%2 !=0){
		
		System.out.println("INVALID STRING");
		System.exit(0);
	}
	int index2 = newStr.indexOf('(');
	int index3 = newStr.indexOf(')');
	String newStr1 = newStr.substring(0,index2) + newStr.substring(index3+1);
	System.out.println(newStr1);
	
}
}
