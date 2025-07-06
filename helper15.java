import java.util.*;
class trds extends Thread
{
    public void run()
    {
        System.out.println("thread 1 is running");
    }
    public void start()
    {
        System.out.println("thread 1 is starting");
    }
}

class trds2 implements Runnable
{
    public void run()
    {
        System.out.println("thread 1 is running");
    }
}

class dt extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is daemon a thread");
        }
        else
        {
            System.out.println(getName() + " is not deamon thread");
        }
    }
}

class sleeptrd extends Thread
{
    public void run()
    {
        for(int i =0;i<=5;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println("exception occurs");
            }
        }
    }
}

public class helper15
{

    public static void main(String[] args)
    {
        //extending using thread class
        trds t1 = new trds();
        trds t2 = new trds();
        trds t3 = new trds();
        t1.start();
        t1.start();

        //implementing using runnable
        trds2 t = new trds2();




        t2.setName("newName");

        //priority thread
        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(1);
        //deamon thread
        dt dt1 = new dt();
        dt dt2 = new dt();
        dt dt3 = new dt();
        dt1.setDaemon(true);
        dt1.start();
        //garbage collection
        t3 = null;
        System.gc();
        //pause a thread using sleep
        sleeptrd std1= new sleeptrd();
        std1.start();

    }
}