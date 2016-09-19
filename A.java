import java.util.*;
class A
{
public static voidmain(String args[])
{
Scanner ob=new Scanner(System.in);
int a=ob.nextInt();
while(a!=0)
{
int b=a%10;
System.out.println(b);
a=a/10;
}
}
}

