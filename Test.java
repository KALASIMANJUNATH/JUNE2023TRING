import java.util.*;
class PolymorphismExample{
void print(){System.out.println("Welcome");}
void print(String n){System.out.println("Welcome"+n);}
}
class Test{
public static void main(String args[]){
PolymorphismExample ob=new PolymorphismExample();
ob.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name:");
String s=sc.next();
ob.print(s);
}
}