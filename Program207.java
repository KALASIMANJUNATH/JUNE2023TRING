import java.util.*;
public class Program207{
public static void main(String[] args){
int cha;
System.out.println("Enter the digit:");
Scanner sc=new Scanner(System.in);
cha=sc.nextInt();
System.out.println();
if(cha>=0&&cha<=9)
System.out.println(cha+"is an digit");
else
System.out.println(cha+"is an not digit");
}
}