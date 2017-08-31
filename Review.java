import java.util.Scanner;

public class Review {
		public static void main(String agrs[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter val");
			int n ; int sum =0; int f = 0;
			int arr[] = new int[6];
			do{
				n = sc.nextInt();
				switch(n){
				case 1: 
					arr[1]=arr[1]+1;
					break;
				case 2: 
					arr[2]=arr[2]+1;
					break;
				case 3: 
					arr[3]=arr[3]+1;
					break;
				case 4: 
					arr[4]=arr[4]+1;
					break;
				case 5: 
					arr[5]=arr[5]+1;
					break;
				}
				sum = sum+n;
				f++;
			}while(n!=0);
			
			for(int i = 5 ; i >= 1 ; i--){
				System.out.print(i+ "("+arr[i]+")"+"|");
				for(int j = 1 ; j<=arr[i]; j++){
					System.out.print("=");
				}
				System.out.println();
			}
			System.out.println((double)sum/(f-1));
			
			
		}
}
