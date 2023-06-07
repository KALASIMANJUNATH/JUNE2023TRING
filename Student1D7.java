
import java.util.*;
class Student1D7
{
int id;
String name;
Student1D7(int i,String n)
{
id=i;
name=n;
}
Student1D7(Student1D7 s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student1D7 s1=new Student1D7(553,"manju");
Student1D7 s2=new Student1D7(s1);
s1.display();
s2.display();
}
}