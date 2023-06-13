public class MultipleCatch5{
public static void main(String args[]){
try{
String s=null;
System.out.println(s.length());
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