class Animal{
Animal(){
System.out.println("animal is created");
}
}
class Dog extends Animal{
Dog()
{
System.out.println("dog is created");
}}
class Test6{
public static void main(String args[])
{
Dog d=new Dog();
}
}