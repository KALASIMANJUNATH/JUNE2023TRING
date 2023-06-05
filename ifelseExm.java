import java.util.*;
class ifelseExm{
public static void main(String args[]){
int i,j;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
if(j==0){
System.out.println("Division error 0");
}
else{
System.out.println(i+" divided by "+j+" is "+(i/j));
}
}
}