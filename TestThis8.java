class Demo3{
int rollno;
String name,course;
float fee;
Demo3(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Demo3(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis8{
public static void main(String args[])
{
Demo3 d1=new Demo3(143,"manju","java");
Demo3 d2=new Demo3(167,"bablu","java",10000);
d1.display();
d2.display();
}
}