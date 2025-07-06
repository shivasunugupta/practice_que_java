import java.util.Collections;
import java.util.LinkedList;

public class helper11 {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

//        a) To Insert the specified element at the specified position.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(5);

//        b) To Insert specified element at the specified position.
        list.add(2, 5);

//        c) To Insert specified element at First and Last position.
        list.addFirst(0);
        list.addLast(6);

//        d) To Iterate a linked list in reverse order.
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

//        e) To remove a specified element from a linked list.
        list.remove(3);
//        f) To retrieve, but not remove, the last element of a linked list.
        list.getLast();

//        g) to remove and return the first element of a linked list.
        list.getFirst();
        list.removeFirst();

//        h) To check if a particular element exists in a linked list.
        System.out.println(list.contains(5));

//        i) To replace an element in a linked list.
        list.set(4, 9);

//        j) To check if a linked list is empty or not.
        System.out.println(list.isEmpty());

    }
}