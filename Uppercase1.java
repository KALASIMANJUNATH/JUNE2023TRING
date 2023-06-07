import java.util.*;
class Uppercase1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strob=sc.nextLine();
strob=strob.toUpperCase();
String rev="";
String temp="";
int ascii;
for(int i=strob.length()-1;i>=0;i--)
{
if(strob.charAt(i)>='a'&& strob.charAt(i)<='z')
{
ascii=strob.charAt(i);
ascii+=32;
temp=temp+(char)ascii;
}
else
{temp=temp+strob.charAt(i);}
}
System.out.print("temp:"+temp);
strob=temp;
for(int i=strob.length()-1;i>=0;i--)
{
rev=rev+strob.charAt(i);}
if(strob.equals(rev))
{
System.out.println("YES");
}
else
{
System.out.println("NO")
}
}
}
