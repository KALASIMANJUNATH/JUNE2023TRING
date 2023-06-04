class Student{
int rollno;
String name;
void insert(int r,String n){
rollno=r;
name=n;
}
void displayinfo(){
System.out.println(rollno+""+name);}
}
class Teststudent6{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insert(222,"MANJU");
s2.insert(333,"NANI");
s1.displayinfo();
s2.displayinfo();
}
}
