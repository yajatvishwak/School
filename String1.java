
public class String1 {
static String max;
static String s1[];
static int i =0 ;
public static void arrange(){
	String t;
	if(i<=5){
	if (s1[i].compareTo(max)>0){
		t = s1[i];
		s1[i] = s1[i+1];
		s1[i+1] = t;
	}
	arrange();
	i++;
	}else{
		return;
	}

 }
	
	public static void main(String agrs[]){
		String s = "Its been a long day";
	   s1 = s.split(" ");  
	   max = s1[0];
	   for(String x : s1){
		   System.out.println(x);
	   }
		
	
}
}
