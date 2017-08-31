import java.util.Scanner;

public class AlphaSorting2 {
	static String stringsort(String s) {
	    if (s.length() < 2) {
	        return s;
	    }

	    int p = 0;
	    char min = s.charAt(0);
	    for(int i = 1; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c < min) {
	            min = c;
	            p = i;
	        }
	    }

	  //  System.out.println( min +" "+ s.substring(0, p) + s.substring(p + 1));

	    return min + stringsort(s.substring(0, p) + s.substring(p + 1));
	}
	
public static void main(String agrs[]){
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter");    
   AlphaSorting2 obj=new AlphaSorting2();
   String str = sc.nextLine();String word ="";
   for(int i = 0 ; i < str.length();i++){
   	if(str.charAt(i)==' '||str.charAt(i)=='.'){
   		if(str.charAt(i)=='.'){
   			System.out.print(obj.stringsort(word)+"."); 
   			break;
   		}
   		 System.out.print(obj.stringsort(word)+" "); 
   		 word ="";
   	}else{
   		word = word + str.charAt(i);
   	}
    	
   }
   
	
}
}
