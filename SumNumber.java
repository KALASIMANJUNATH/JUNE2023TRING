import java.util.*;
public class SumNumber
{
public static void main(String[] args)
{
int sum;
Scanner sc=new Scanner(System.in);
sum=sc.nextInt();
for(int i=1;i<=sum;i++)
{
sum +=i;
}
System.out.println("Sum:"+sum);
}
}