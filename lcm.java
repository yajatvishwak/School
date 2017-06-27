
public class lcm {
  int c =1;


	public  int lol(int a , int b){
if(c%a==0 && c%b==0){
	
	return c;

}
c++;

return lol(a,b);
 
		
	}
	
	
	public static void main(String[] args) {
	  lcm ob = new lcm();
		int c1= ob.lol(3,9);
		System.out.println(c1);
		// TODO Auto-generated method stub
   
	}

}
