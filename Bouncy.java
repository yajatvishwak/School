	import java.util.*;
public class Bouncy {



	    boolean isI(int n) 
	    {
	        String s = Integer.toString(n);
	        char ch;
	        int f = 0;
	        for(int i=0; i<s.length()-1; i++)
	        {
	            ch = s.charAt(i);
	            if(ch>s.charAt(i+1))
	            {
	                f = 1;
	                break;
	            }
	        }
	        if(f==1)
	            return false;
	        else
	            return true;
	    }
	     
	    boolean isD(int n) 
	    {
	        String s = Integer.toString(n);
	        char ch;
	        int f = 0;
	        for(int i=0; i<s.length()-1; i++)
	        {
	            ch = s.charAt(i);
	            if(ch<s.charAt(i+1))
	            {
	                f = 1;
	                break;
	            }
	        }
	        if(f==1)
	            return false;
	        else
	            return true;
	    }
	     
	    void isBouncy(int n)
	    {
	        if(isI(n)==true)
	            System.out.println(  n + "  Not Bouncy");
	        else if(isD(n)==true)
	            System.out.println(  n + "  Not Bouncy");
	        else
	            System.out.println(  n + " is bouncy");
	    }
	     
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        Bouncy ob = new Bouncy();
	        System.out.print("Enter a number  ");
	        int n = sc.nextInt();
	        ob.isBouncy(n);
	    }
	}

