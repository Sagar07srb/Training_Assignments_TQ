package thread_Assignments;

class Name extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Keep some task here....");
    }
}
 
public class NamingAThread
{
    public static void main(String[] args)
    {
        Name thread = new Name();     
 
        thread.start();                     
 
        thread.setName("Naming A Thread");        //Giving a name to the thread
 
        String name = thread.getName();    
 
        System.out.println(name);   
    }
}