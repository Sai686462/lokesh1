import java.util.*;
class pattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n;
System.out.println("enter the value of n");
n=sc.nextInt();
for(i=n;i>=1;i--)
{
for (j=n;j>=1;j--)
{
System.out.print(j);
}
System.out.println("");
}
}
}
