class MyThread extends Thread{
public void rin()
{
System.out.println("shut down hook task complete...");
}
}
class TestShutdown1{
public static void main(String args[])throws Exception{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new MyThread());
System.out.println("New main sleep.... press ctrl+c to exit");
try{Thread.sleep(3000);}catch(Exception e){}
}
}