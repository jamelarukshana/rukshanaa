import java.util.Scanner;
class VowCons
{
public static void main(String args[])
{
int ltr;
Scanner sc=new Scanner(System.in);
ltr=sc.next().charAt(0);
  System.out.println(+ltr);
if(ltr='A'||ltr='E'||ltr='I'||ltr='O'||ltr='U')
  System.out.println("vowels");
if(ltr='B'||ltr='C'||ltr=='D'||ltr='F'||ltr='G'||ltr='H'||ltr='J'||ltr='K'||ltr='L'||ltr='M'||ltr='N'||ltr='P'||ltr='Q'||ltr='R'||ltr='S'||ltr='T'||ltr='V'||ltr='W'||ltr='X'||ltr='Y'||ltr='Z')
  System.out.println("consonants");
else
  System.out.println("invalid");
}
}
