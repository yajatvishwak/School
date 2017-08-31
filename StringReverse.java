import java.util.Scanner;

public class StringReverse 
{
    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        else
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
        StringReverse obj=new StringReverse();Scanner sc = new Scanner(System.in);System.out.println("enter the sentence");String n = sc.nextLine() +" ";
        String str= "";
        String ans="";
       for(int i=0;i<n.length();i++)
       {
    	   if(n.charAt(i)==' '){
    		   ans = obj.reverse(str);  
   	        if(ans.equalsIgnoreCase(str)){
   	        	System.out.println(ans);
   	        }
   	        ans = "";
   	        str="";
    	   }else 
    	   {
    		   str=str+n.charAt(i);
    	   
    	   }
    	  
       }
   
    }    
}
