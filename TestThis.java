class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}
 
class TestThis{
public static void main(String args[]){
Student s1=new Student(222,"Manju",50000f);
Student s2=new Student(555,"cnu",60000f);
s1.display();
s2.display();

}
}