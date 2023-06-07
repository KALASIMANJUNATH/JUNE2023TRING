import java.util.*;
class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,k;
i=sc.nextInt();//100
j=sc.nextInt();//30
k=sc.nextInt();//40
if(i<j)
{
System.out.println(k);
}
else if(k<i)
{
System.out.println(i);
}
else
{
System.out.println(j);
}
}
}

