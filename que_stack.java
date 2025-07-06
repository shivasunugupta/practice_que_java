import java.util.*;
public class que_stack
{

    // que push at bottom
      public static void pushatbottom(int data,Stack<Integer> s)
      {
          if (s.isEmpty())
          {
              s.push(data);
              return;

          }
          int top = s.pop();
          pushatbottom(data, s);
          s.push(top);
      }

      public static void reverse(Stack<Integer> s)
      {
          if (s.isEmpty())
          {
              return;
          }
          int top = s.pop();
          reverse(s);
          pushatbottom(top,s);
      }

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);


//        pushatbottom(4,s);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

        // que 2 reverse a stack

    }



}
