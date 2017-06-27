
public class Special {
	static int c ; 
	static int sum; 
	static int fact(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
		 }
static int getNumber(int number){
if(number == 0){
           return c;
       } else {
           c = (number%10);
           sum = sum+ fact(c);
           getNumber(number/10);
       }
   return c;

	
}
public static void main(String agrs[]){
	int a = getNumber(40585);
	if(sum==40585){
		System.out.println("Special");
	}
	
}

}
