import java.util.*;
public class Program206{
public static void main(String[] args){
char cha;
System.out.println("Enter the character:");
Scanner sc=new Scanner(System.in);
cha=sc.next().charAt(0);
System.out.println();
if((cha>='a'&&cha<='z')||(cha>='A'&&cha<='Z'))
System.out.println(cha+"is an alphabet");
else
System.out.println(cha+"is not an alphabet");
}
}