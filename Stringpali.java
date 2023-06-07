import java.util.*;
class Stringpali{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strob=sc.nextLine();
strob=strob.toLowerCase();
String rev="";
for(int i=strob.length()-1;i>=0;i--){

rev=rev+strob.charAt(i);}
if(strob.equals(rev)){
System.out.print("YES");
}
else
{
System.out.print("NO");
}
}
}