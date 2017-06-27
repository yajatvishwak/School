import java.util.Scanner;

public class Blr2mum 
{
	static int arr[][];
	Blr2mum (){
		arr = new int[4][4];
	}
	
	static int bus;
	public static int B (int i,int j)
	{
		System.out.print("B");
		return arr[i+1][j];
	}
	public static int R (int i,int j)
	{
		System.out.print("R");
		return arr[i][j+1];
	}
	public static int D (int i,int j)
	{
		System.out.print("D");
		return arr[i+1][j+1];
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int i ;
		int j;
		int hops = 0;
		int output[] = new int[6];
		for(i = 0; i<4 ;i++)
		{
			for(j = 0; j <4; j++)
			{
				System.out.println("Enter the value in cell ("+i +j+")");
				arr[i][j] = sc.nextInt();
			}
		}
		
		bus = arr[0][0];
		int m = 0;
		int y =0; int z=0;
		while(hops <=6)
		{
			int b,d,r;
			b = B(y,z);
			d = D(y,z);
			r = R(y,z);
			bus = (b>d)?(d>r)?d:r:(b<r)?b:r;
			m+=bus;
			
			if(bus == b ){
				y ++;
				
			}else if(bus == d){
				z++;
				
			}else{
				y++;
				z++;
			}
			
			output[hops] = bus;
			hops++;
		}
		
		
		
		
		System.out.println(m);
		
		
		/*for(i = 0; i < 4; i++)
		{
			for(j = 0; j < 4; j++)
			{
				int a , b;
				a =i;
				b =j;
			}
		}*/
	}
	
	
}
