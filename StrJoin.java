import java.lang.*;
public class StrJoin
{
public static void main(String args[])
{
String s1=new String("M.S.");
String s2=new String("Dhoni");
String s3=new String("Thala");
String s=String.join("#",s1,s2,s3);
System.out.println(s.toString());
}
}