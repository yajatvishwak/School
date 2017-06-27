import java.util.*;
class Magic_Number
{
static int s=0;
public static void main(String args[])
{
Magic_Number ob=new Magic_Number();
Scanner in =new Scanner(System.in);
System.out.print("Enter a Number:>");
int n=in.nextInt();
if(ob.Magic_Check(n)==1)
{
System.out.println(n+" is a MAGIC NUMBER");
}
else
{
System.out.println(n+" is NOT a MAGIC NUMBER");
}
}
public int Magic_Check(int n)
{
if(n==0&&s<10)
{
return s;
}
else
{
s+=n%10;
if(n==0)
{
n=s;
s=0;
}
return Magic_Check(n/10);
}
}
}


