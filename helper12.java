import java.util.*;
public class helper12
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

//        a) Add elements to the queue.
        q.add("hello");
        q.add("hello2");
        q.add("hello3");
        System.out.println(q);

//        b) Access elements of the queue.
        for (String elements : q)
        {
            System.out.println(elements);
        }

//        c) Remove elements of the queue.
        q.remove(2);

    }
}
