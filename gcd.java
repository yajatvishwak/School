
public class gcd {
public static int hcf(int a, int b) {
	if(a==b){
		return a;
	} else if (a>b) {
		return hcf(a-b,b);
	}
	 else{
			return hcf(a,b-a);
		}
	
}
public static void main(String agrs[]) {
	int a = hcf(12,9);
	System.out.println(a);
}
}
