import java.util.*;
class Print8{
public static void main(String args[]){
int count;
int i;
Scanner sc=new Scanner(System.in);
count=sc.nextInt();
i=sc.nextInt();
while(count<=i){
System.out.print(count);
count=count+1;
if(i>=count) {System.out.print(",");}
}
}}