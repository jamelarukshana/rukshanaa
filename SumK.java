import java.io.*;
import java.util.Scanner;
class SumK
{
public static void main(String args[])
{
int a[]={0,1,2,3,4,5,6,7,8,9};
int sum=0;n,k,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=sc.nextInt();
System.out.println(+n);
for(i=0;i<n;i++)
System.out.println(+a[i]);
System.out.println(+k);
for(i=0;i<=k;k++)
sum=sum+a[i];
}
}
