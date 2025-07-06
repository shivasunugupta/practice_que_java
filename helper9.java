import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class helper9
{
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();

//        a) To insert 5 Elements of string type.
        st.add("add");
        st.add("five");
        st.add("elements");
        st.add("in a");
        st.add("string");
        System.out.println(st);

//        b) To insert Element at a specific Index.
        st.add(0,"adding");

//        c) To retrieve an element (at a specified index) from a given array list.
        st.get(2);

//        d) To update an array element by the given element.
        st.set(4,"new string");

//        e) To delete Element at a specific Index.
        st.remove(2);

//        f) To search for an element in an array list.
        st.contains("five");

//        g) To sort the array list.
        Collections.sort(st);
        System.out.println(st);

//        h) To reverse elements in an array list.
        Collections.sort(st,Collections.reverseOrder());
        System.out.println(st);

//        i) To iterate through all the elements of an ArrayList.
        Iterator<String> iterator = st.iterator();
        while (iterator.hasNext())
        {
            String i = iterator.next();
            System.out.println(i);
        }
        System.out.println(st);

    }
}
