import java.util.*;
class salary

{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int accountno,current_balance;
String name;
float transaction_amount,net_balance;
char transaction_code;
System.out.println("enter the accountno");
accountno=sc.nextInt();
System.out.println("enter the current_balance");
current_balance=sc.nextInt();
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the transaction_amount");
transaction_amount=sc.nextFloat();

System.out.println("enter the transaction_code");
transaction_code=sc.next().charAt(0);


if(transaction_code=='d')
{
current_balance=current_balance+transaction;
System.out.println("current_balance="+current_balance);
}
else
{
current_balance=current_balance-transaction;
System.out.println("current_balance="+current_balance);

}
System.out.println("net_balance="+net_balance);

}
}



