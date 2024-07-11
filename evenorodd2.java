import java.util.*;
class evenorodd2
{
public static void main(String args[])
{
int n,i=1,evensum=0,oddsum=0,num;
Scanner sc=new Scanner(System.in);

System.out.println("enter the value of n");
n=sc.nextInt();
i=1;
while(i<=n)
{
System.out.println("enter the value of num");
num=sc.nextInt();


if(n%2==0)

evensum=evensum+num;

else

oddsum=oddsum+num;
}

i++;
System.out.println(evensum);
System.out.println(oddsum);

}
}