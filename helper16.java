class SharedResource
{
    private int count = 0;

    // Synchronized method
    public synchronized void increment()
    {
        for (int i = 0; i < 3; i++)
        {
            count++;
            System.out.println("Synchronized method "+Thread.currentThread().getName() + " : " + count);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Synchronized block
    public void decrement()
    {
        synchronized (this)
        {
            for (int i = 0; i < 3; i++)
            {
                count--;
                System.out.println("Synchronized block "+Thread.currentThread().getName() + " : " + count);
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable implements Runnable
{
    private SharedResource resource;
    public MyRunnable(SharedResource resource)
    {
        this.resource = resource;
    }
    @Override
    public void run()
    {
        resource.increment();
        resource.decrement();
    }
}
public class helper16
{
    public static void main(String[] args)
    {
        SharedResource resource = new SharedResource();

        // Creating two threads
        Thread thread1 = new Thread(new MyRunnable(resource));
        Thread thread2 = new Thread(new MyRunnable(resource));

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}