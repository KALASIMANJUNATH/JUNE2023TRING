import java.util.Scanner;
import java.lang.String;
public class Countdigit
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int didit=0;
for(int i=0;i<=str.length()-1;i++)
{
if ((str.charAt(i)=='0')||(str.charAt(i)=='9'))
{digit++;
}
}
System.out.println(diigit);
}
}