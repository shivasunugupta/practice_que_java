import java.util.*;
public class helper7
{
    public static void main(String[] args) {
        ArrayList <Object> al = new ArrayList<>();

        al.add(new area(8));
        al.add(new Interest(6,0,4));


        for (int i=0 ; i<al.size();i++)
        {
            System.out.println(al.get(i).toString());
        }
    }
}

class area
{
    int a ;
    public area(int side)
    {
        a =side*side;
    }
    public String toString()
    {
        return "area of square is " + a;
    }
}

class Interest
{
    double i;
    public Interest(int p,int t,int r)
    {
        i = (p*t*r)/100;
    }

    public String toString()
    {
        return "interest is "+ i;
    }
}