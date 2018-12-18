import java.util.Scanner;
import java.io.*;
import java.lang.*;
class Alp
{
public static void main(String args[])
{
int alp;
Scanner sc=new Scanner(System.in);
alp=next().charAt(0);
System.out.println(+alp);
if((alp>='a'&& alp<='z')||(alp>='A' && alp<='Z'))
  System.out.println("Alphabet");
else
  System.out.println("No");
}
}
