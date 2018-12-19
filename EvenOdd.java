import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
int val;
Scanner sc=new Scanner(System.in);
val=sc.nextInt();
System.out.println(+val);
if(val%2==0)
  System.out.println("Even");
if(val%2==1)
  System.out.println("Odd");
else
  System.out.println("invalid");
}
}
