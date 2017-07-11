import java.util.Scanner;

public class kapavar {
public static void main(String agr[]){
	
	Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Number : ");
    long n = sc.nextInt();
 
     long sq = n*n;
     String s = Long.toString(sq); 
     if(sq<=9)
        s = "0"+s; 
 
     int l = s.length(); 
     int mid = l/2; 
 
     String left=s.substring(0,mid); 
     String right=s.substring(mid);
 
     long x = Long.parseLong(left); 
     Long y = Long.parseLong(right); 
 
     
     if(x+y == n) 
        System.out.println(n+" is a Kaprekar Number");
     else
        System.out.println(n+" is Not a Kaprekar Number");
   }
	
	
	

}
