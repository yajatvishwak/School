import java.util.Scanner;

public class WeirdString {
	public static String fun3(String n){
		 
		int pos = 0 ;
		for(int i=0; i<n.length(); i++)
          {
              char ch=n.charAt(i);
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              {
                  pos=i; 
                  break;
              }
          }
		  
		     if(pos!=-1) 

	            {
	              String a=n.substring(pos); 
	              String b=n.substring(0,pos); 
	              String pig=a+b+"c";
	            return pig;
	            }
	            else
	             return "";
	        }
		
	
	
	
	public static String fun2(String n){
		boolean s = false;
		for(int i = 0 ; i < n.length(); i++){
			if(n.charAt(0)=='a'||n.charAt(0)=='e'||n.charAt(0)=='i'||n.charAt(0)=='o'||n.charAt(0)=='u'){
				s = true;
			}
			 
		}
		if(s){
			return "";
		}else{
			return n+"n";
		}
	}
	
	
	public static String fun(String n){
		
			if(n.charAt(0)=='a'||n.charAt(0)=='e'||n.charAt(0)=='i'||n.charAt(0)=='o'||n.charAt(0)=='u')
				return n+"y";
			else
				return "";
		
	}
	
	
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String n = sc.nextLine()+" ";
		for(int i = 0; i < n.length();i++){
			String word = null;
			if(n.charAt(i)==' '){
			 String uno =fun(word);
			 String dos = fun2(word);
			 String tres = fun3(word);
			 System.out.println(uno+dos+tres);
			 word = "";
			}else{
				word = word + n.charAt(i);
			}
			
		}
		
		
	}
}
