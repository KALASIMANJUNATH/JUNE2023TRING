class Student{
int rollno;
String name;
static String college="ITS";
Student(int r,String s){
rollno=r;
name=s;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStatic{
public static void main(String args[]){
Student s1=new Student(111,"manju");
Student s2=new Student(111,"manju");
Student.college="K.MAnju";
s1.display();
s2.display();
}
}