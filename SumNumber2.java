import java.util.Scanner;
public class SumNumber2
{
public static void main(String[] args)
{
int sum=0;
int k;
Scanner sc=new Scanner(System.in);
k=sc.nextInt();
for(int i=1;i<=k;i++)
{
sum +=i;
}
System.out.println("Sum:"+sum);
}
}