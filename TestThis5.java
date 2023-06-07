class A {
A(){
System.out.println("hello A");}
A(int x){
this();
System.out.print(x);
}
}
class TestThis5{
public static void main(String args[]){
A a=new A(10);
}}