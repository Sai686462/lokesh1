import java.io.*;
class palindrome
{

public static void main(String args[])
{
int a=252;
String result;
result=(a%10==a/100)?"palindrome":"not a palindrome";
System.out.println(result);
}
}