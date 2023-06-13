public class MultipleCatch6{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e){
System.out.println("Command task ");
}
catch(ArithmeticException e)
{
System.out.println("task1 is completed");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("task2 completed");
}
System.out.println("rest of code...");
}
}