import java.io.*;
public class TryCatchEx{
public static void main(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("jtp.txt");
pw.println("saved");
}
catch(Exception e){
System.out.println(e);
}
System.out.println("File is saved");
}
}