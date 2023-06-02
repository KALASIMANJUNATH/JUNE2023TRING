
import java.util.Scanner;
class DayNumber2
{
public static void displayDay(int n)
{
switch(n)
{
case 0:System.out.println("SUNDAY");break;
case 1:System.out.println("MONDAY");break;
case 2:System.out.println("TUESDAY");break;
case 3:System.out.println("WENDESDAY");break;
case 4:System.out.println("THURSDAY");break;
case 5:System.out.println("FRIDATY");break;
case 6:System.out.println("SATURDAY");break;
default:System.out.println("INVALID");
}
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
displayDay(dn);
}
}