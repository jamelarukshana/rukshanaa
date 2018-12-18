import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
int value;
Scanner sc=new Scanner(System.in);
value=sc.nextInt();
System.out.println(+value);
if(value%2==0)
  System.out.println("Even");
else
  System.out.println("Odd");
}
}
