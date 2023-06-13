public class MultipleCatch{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e){
System.out.println("ArrayIndexOutOfBound");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBound");
}
catch(Exception e)
{
System.out.println("Parent Exception");
}
System.out.println("rest of code...");
}
}