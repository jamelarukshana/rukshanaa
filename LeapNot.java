import java.io.*;
import java.util.Scanner;
class LeapNot
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(year%4==0)
  System.out.println("yes");
else
  System.out.println("no");
 
}
}
