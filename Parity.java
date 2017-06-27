import java.util.Scanner;

public class Parity {
public static void main(String agrs[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter test case");
	int n1 = 0 ,n2 = 10;
	
	
       
    	if(n1>n2){
    		int t = n2;
    		n2=n1;
    		n1 = t;
    	}
    	
    	int f =0;
         for(int i = n1; i <=n2;i++){
        	 String b1 = Integer.toBinaryString(i);
        	 int c1 = 0;
         	for(int j = 0 ; j < b1.length(); j++){
         		if(b1.charAt(j)=='1'){
         			c1++;
         		}
         	}
         	if(c1%2==0){
         		f++;
         	}
         		
         	}
         System.out.println(f);
       
         }
        
    
	
}


