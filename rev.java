import java.io.*;
class rev
{
public static void main(String args[])
{
int num=1234,rem,reversed=0;
while(num!=0)
{
rem=num%10;
reversed=reversed*10+rem;
num /=10;
}
System.out.println("Reversed number:"+reversed);
}
}