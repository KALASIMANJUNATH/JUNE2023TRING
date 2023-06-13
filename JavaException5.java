public class JavaException5{
public static void main(String args[]){
try{
int arr[]={1,3,4,5};
System.out.println(arr[10]);
}
catch(Exception e){
System.out.println(e);
}

System.out.println("rest of the code....");
}
}