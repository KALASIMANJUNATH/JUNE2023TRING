
import java.util.*;
class Student2D7
{
int id;
String name;
Student2D7(int i,String n)
{
id=i;
name=n;
}
Student2D7()
{

}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student2D7 s1=new Student2D7(553,"manju");
Student2D7 s2=new Student2D7();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}