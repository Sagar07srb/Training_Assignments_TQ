package thread_Assignments;

class TDemo extends Thread
{
    public TDemo(String name)
    {
        super(name);
    }
 
    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("from "+getName());
        }
    }
}
 
public class ThreadPriority
{
    public static void main(String[] args)
    {
        TDemo t1 = new TDemo("Thread 1");
 
        t1.setPriority(5);         //Setting the priority of Thread 1
 
        t1.start();
 
        TDemo t2 = new TDemo("Thread 2");
 
        t1.setPriority(7);         //Setting the priority of Thread 1
 
        t2.start();
 
        System.out.println(t1.getPriority());      
 
        System.out.println(t2.getPriority());      
    }
}
