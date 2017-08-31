import java.util.Scanner;



public class Decodethis {
	public static int numb(char n){
		int a;
		if(Character.isLetter(n)){
			if(Character.isUpperCase(n))
				a = (int) n -64;
			else
				a =(int)n - 96;
		}else{
			return 1;
		}
		return a;
	}
public static void main(String agrs[]){
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter sentence and the array length");
	String n = sc.nextLine();
	System.out.println("Enter sentence and the array length");
	int i = sc1.nextInt();
	String arr[] = new String[i];
	//store each letter
	for(int i1 = 0 ; i1 < i;i++ ){
		arr[i1]= ""+n.charAt(i1);
	}
	arr[0] = ""+n.charAt(0);
	String ans="";
	int skip = 0;
	int skip1 =0;
	while(arr != null){
		if(skip1<=n.length())
			skip1 =0;
		skip = numb(n.charAt(skip1));
		 skip1 = skip+skip1;
		ans = ans + arr[skip1];
		arr[skip1] = null;
	}
	
	System.out.println(ans);
}
}
