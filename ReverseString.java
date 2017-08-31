
 import java.util.*;
	public class ReverseString 
	{
	    public String reverse(String str) 
	    {     
	        if ((str==null)||(str.length() <= 1) )
	            return str;
	        return reverse(str.substring(1)) + str.charAt(0);
	    }
	    public static void main(String[] args) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	 System.out.println("Enter");    
	        ReverseString obj=new ReverseString();
	        String str = sc.nextLine();String word ="";
	        for(int i = 0 ; i < str.length();i++){
	        	if(str.charAt(i)==' '||str.charAt(i)=='.'){
	        		if(str.charAt(i)=='.'){
	        			System.out.print(obj.reverse(word)+"."); 
	        			break;
	        		}
	        		 System.out.print(obj.reverse(word)+" "); 
	        		 word ="";
	        	}else{
	        		word = word + str.charAt(i);
	        	}
	         	
	        }
	        
	       
	        
	        
	    }    
	}
	


