import java.util.*;
class compositenumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,pre=0 ,rem,current=0,i=1,count=0;
//System.out.println("enter the value of n");
//n=sc.nextInt();
for(n=1;n<=10;n++){
for(i=1;i<n;i++)
{

if(n%i==0)
{
count++;

}

if(count>2)
{
pre=current;
current=i;
}
}
}

int diff=current-pre;
if(diff==1)
{
System.out.println(pre+" "+current);
}
}                                                                                                                                                                                                                                                                                                                                                    

}
