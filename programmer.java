class Employee{
float salary=4000;
}
class programmer extends Employee{
int bonus=1000;
public static void main(String args[]){
programmer p=new programmer();
System.out.println("Programmer salary is :"+p.salary);
System.out.println("Bonus if programmer:"+p.bonus);
}
}