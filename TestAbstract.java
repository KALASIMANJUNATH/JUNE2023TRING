abstract class Bike{
Bike(){
System.out.println("bike is created");
}
abstract void run();
void changeGear()
{
System.out.println("gear changed");}
}
class R152 extends Bike{
void run()
{
System.out.println("running safely");
}}
class TestAbstract
{
public static void main(String args[])
{
Bike obj=new R152();
obj.run();
obj.changeGear();
}
}