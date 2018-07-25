import java.io.*;
import java.lang.*;
class fibo
{
public static void main(String args[])
{
int n=10,i,t1=0,t2=1;
System.out.println("First terms:");
for(i=1;i<=n;i++)
{
System.out.println(t1+"+");
int sum=t1+t2;
t1=t2;
t2=sum;
}
}
}
