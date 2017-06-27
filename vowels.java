
public class vowels {
static int c;
static int n;
	public static String count(String a,int k){
		if(a.length()>c){
		if(a.charAt(c)=='a'||a.charAt(c)=='e'||a.charAt(c)=='i'||a.charAt(c)=='o'||a.charAt(c)=='u'){
			n++;
			return count(a,c++);
		}
		return count(a,c++);}else{
			return "0";
		}
		
	} 
	
	public static void main(String agrs[]){
	
	count("yoloo",4);
	System.out.println(n);
	
}
}
