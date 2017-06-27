import java.util.Scanner;

public class Adder {
	int a [] ;
	int sum;
	Adder() {
		a = new int[2];
		a[0] =0;
		a[1] =0;
		
	}

void runTime(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements");
	a[0] = sc.nextInt();
	a[1] = sc.nextInt();
	
}

void addtime(Adder x , Adder y){
	int i = x.a[0];
	int j = x.a[1];
	long time = 23715000;
	int s = (int)((time/=1000) % 60);
	int m = (int)((time/=60) % 60);
	int h = (int)(time/=60);
	System.out.format("%02d:%02d:%02d%n", h, m, s);
	 System.out.println(sum);
	
}
	public static void main(String agrs[]){
	Adder obb1 = new  Adder();
	Adder obb2 = new  Adder();
	obb1.runTime();
	obb1.addtime(obb1, obb2);
	
	
	
	
	
}
}
