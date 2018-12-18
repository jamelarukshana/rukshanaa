import java.util.Scanner;
class VowCon
{
public static void main(String args[])
{
int ltr;
Scanner sc=new Scanner(System.in);
ltr=sc.nextInt();
  System.out.println(+ltr);
if(ltr='A'||ltr='E'||ltr='I'||ltr='O'||ltr='U')
  System.out.println("vowels");
else
  System.out.println("consonants");
}
}
