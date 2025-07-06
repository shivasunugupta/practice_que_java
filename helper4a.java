import java .util.*;
public class helper4a
{
    public static void main (String [] args)
    {
        try
        {
            List <Integer> l = readNumber();
            checkDuplicate(l );
        }
        catch (Duplicate_Number_Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static List<Integer> readNumber()
    {
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner (System.in);
        System.out.println("number of inputs");
        int count = sc.nextInt();
        System.out.println("input of integer");
        for(int i=0;i<count;i++)
        {
            int num = sc.nextInt();
            l.add(num);
        }
        return l;
    }
    public static void checkDuplicate(List<Integer> l)throws Duplicate_Number_Exception
    {
        Set<Integer> uniqueNum = new HashSet <>();
        for (int num: l)
        {
            if(uniqueNum.contains(num))
            {
                throw new Duplicate_Number_Exception("duplicate number found "+ num);
            }
            else
            {
                uniqueNum.add(num);
            }
        }
    }
}
class Duplicate_Number_Exception extends Exception
{
    public Duplicate_Number_Exception(String message)
    {
        super (message);
    }
}





