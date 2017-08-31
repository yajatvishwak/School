import java.util.Scanner;

public class Happy_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int n = sc.nextInt();
       String n1 = Integer.toString(n);
       int ans = 0;
	while(ans>9){
    	int sumsq = 0;   
		for(int i = 0 ; i < n1.length(); i++){
    		   sumsq = (int) (sumsq + Math.pow(Integer.parseInt(""+n1.charAt(i)), 2));
    	   }
    	   n1 = ""+sumsq;
    	   ans = sumsq;
    	   if(sumsq == 1){
    		  System.out.println("It is happy");
    		  System.exit(0);
    	   }
       }
	System.out.println("It is unhappy");
	
	}

}
