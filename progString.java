import java.util.Scanner;

public class progString {
public static void main(String agrs[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Search token");
	String searchToken = sc.nextLine();
	System.out.println("Enter sen");
	String sen = sc.nextLine();
	int firstIndex =0;
	int lastIndex = 0;
	 firstIndex = sen.indexOf(searchToken);
	 lastIndex = sen.lastIndexOf(searchToken);
	if(firstIndex==0 && lastIndex==0){
		System.exit(0);
	}
	
	String s = sen.substring(firstIndex,lastIndex );
 int temp = s.indexOf(' ');
 s = s.substring(temp);

	System.out.println(s);
	
}
}
