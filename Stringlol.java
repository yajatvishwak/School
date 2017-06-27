
import java.util.*;
public class Stringlol {
	static String lol;
	static int i =0;
	public static void Encode (String n , int m ){
   
		if(i==n.length()){
			
		}else{
    
    	 char c1 =  n.charAt(i);
    	 int a = c1;
    	 a+=m;
    	 if(a>90){
    		 a-=26;
    	 }
    	 if (a<65){
    		 a = a+26;
    	 }
		
    	 lol+=(char)a;
    	 i++;
    	 Encode(n,m);
		}
     }
	public static void main(String agrs[]){
		Encode("ZAB",-2);
		System.out.println(lol);
		
	}

		
	
	
}

