import java.util.Scanner;
class PositiveNegative
{
public static voidmain(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("Output:"+num);
if(num==0)
  System.out.println("Zero");
if(num>0)
  System.out.println("Positive");
else
  System.out.println("Negative");
  
}
}
