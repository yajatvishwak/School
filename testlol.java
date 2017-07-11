import java.util.Scanner;

public class testlol {
	static  String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
     };
    static  String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
   
	public static void PrintNumber(int number){
	  
		
			if(number<19){
				System.out.print(ones[number]);
			}else{
				  int temp = number/10;
				  int temp1 = number%10;
				System.out.print(tens[temp] + ones[temp1] );
			}
		
		
	}
    
    public static void main(String agrs[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter number" );
	 int in = sc.nextInt();
	 
	
	// PrintNumber(in/100000);System.out.print("Lakhs"); in = in%100000;
	 PrintNumber(in/1000);System.out.print("thousand"); in = in%1000;
	 PrintNumber(in/100);System.out.print("hundred and"); in = in%100;
	 PrintNumber(in); 
	 
	 
	
}
}
