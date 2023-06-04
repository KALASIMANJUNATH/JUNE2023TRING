//import java.lang.String;
class Student{
int rollno;
String name;
Student()
{
rollno=0;
name=null;
}
Student(int r,String n){
rollno=r;
name=n;
}
void displayinfo(){
System.out.println(rollno+" "+name);
}
}
class Testst1{
public static void main(String args[]){
Student s1;
s1=new Student();
Student s2=new Student(553," Manju");
s1.displayinfo();
s2.displayinfo();
}
}