
import java.util.*;
public class Test1 {
public static void main(String agrs[]){
	System.out.println("lol");
	int n =2;
	if(n > 3){
		System.out.println("Bad input");
		System.exit(0);
	}else{
		System.out.println("Enter length");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Enter values");
		int a[] = new int[m];
		int newA[] = new int[m-1];
		int newerA[] = new int[m];
		for(int i = 0 ;i < m ; i++){
			a[i] = sc.nextInt();
		}
		
	
		for(int x = 0; x< m-1; x++){
			newA[x] =  a[x+1] - a[x];
			}
		newerA[0] = a[0];
		for(int i = 0 ; i<m-1;i++){
			System.out.print(newA[i+1] + newA[i]);
		}
		
		
	

}
}
public static int invert(int n){

	return n*-1;
}
}