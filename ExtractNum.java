import java.util.*;
class ExtractNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strob=sc.nextLine();
String rs="";
for(int i=0;i<=strob.length()-1;i++){
if(strob.charAt(i)>='0' && strob.charAt(i)<='9')
{rs=rs+strob.charAt(i);}
//System.out.print(i);
}
System.out.print(rs);
}
}
