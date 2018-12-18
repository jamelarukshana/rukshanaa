import java.util.Scanner;
class PositiveNegative
{
public static voidmain(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("The given number is="+num);
if(num==0)
  System.out.println("The number is Zero");
if(num>0)
  System.out.println("The number is Positive");
else
  System.out.println("The number is Negative");
  
}
}
