//Initializating object through constructor

class Student{
int rollno;
String name;
Student(){
rollno=0;name=null;
}
Student(int r,String n){
rollno=r;
name=n;
}
void displayinformation(){
System.out.println(rollno+" "+name);
}
}
class TestStudent7
{
public static void main(String args[]){
Student s1;
s1=new Student();
Student s2=new Student(553,"Manju");
s1.displayinformation();
s2.displayinformation();
}}