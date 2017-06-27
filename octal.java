public class octal{
	static String ans;
	public static void ctr(int n){
		if(n>=1){
			int r = n%8;
			ans = ans+Integer.toString(r);
			ctr(n/8);
			
		}else{
			return;
		}
	}
	
	public static void main(String agrs[]){
		int a = 113;
		ctr(a);
		System.out.println(ans);
		
	}
	
	
}