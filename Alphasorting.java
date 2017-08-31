import java.util.Scanner;

public class Alphasorting {
	
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
    	 System.out.println("Enter Word");
    	 String n = sc.nextLine().toUpperCase();
    	String n1 = stringsort(n);
    	System.out.println(n1);
    	 char ALPHA[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    	 for(char x: ALPHA){
    		 System.out.print(x +" ");
    	 }
    	 System.out.println();
    	 for(int i = 0 ; i < n1.length() ; i++){
    		 
    		for(int j = 0 ; j <ALPHA.length;j++){
    			if(ALPHA[j]==n.charAt(i)){
    				ALPHA[j] = ' ';
    				break;
    			}
    			
    		}
    		 
    	 }
    	 
    	 for(char x: ALPHA){
    		 System.out.print(x +" ");
    	 }
    	 
     }
}
