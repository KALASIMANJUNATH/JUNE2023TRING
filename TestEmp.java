class Employee{
int id;
String name;
float salary;
void insert(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmp{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(553,"Manju",50000);
e2.insert(507,"CNU",48000);
e3.insert(528,"BEER",48000);
e1.display();
e2.display();
e3.display();
}
}





