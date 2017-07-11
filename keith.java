import java.util.Scanner;

public class keith {
public static void main(String agr[]){
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int number = sc.nextInt();

int arr[] = new int[100];
//exstract
int a , b, c;
arr[0]=1;
arr[1]=9;
arr[2] = 7;
a = arr[0];
b = arr[1];
c = arr[2];
int sum = a+b+c;
int i = 3;
int j = 1;
arr[i]=sum;
boolean bool = false;
while(sum<=number){
	if(number==arr[i]){
		 bool = true;
	}
	
	a= arr[j];
	b=arr[j+1];
	c = arr[j+2];
	sum =a+b+c; 
	i++;
	arr[i]=sum;
	 j++;

}

System.out.println(bool);
}
}
