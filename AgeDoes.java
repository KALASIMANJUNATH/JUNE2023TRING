import java.util.*;
class AgeDoes{
String msg;
AgeDoes(String msg){
super(msg);
this.msg=msg;
}
@Override
public String toString(){
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18){
throw new Exception("Entered age does not fullfill");
}
}
catch(Exception e){
System.out.println(e);
System.out.println(e.getMessage());
}
}
}
