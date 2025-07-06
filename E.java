import java.util.*;

class L
{
    String Studentname;

    L(String name)
    {
        this.Studentname = name;
    }

    void displayIt(String coursename)
    {
        System.out.println("Dear, " + Studentname + "!. You must enroll in " + coursename + ".");
    }


}

class M
{
    void choice()
    {
        System.out.println("My name is Shivasunu! I love to fuck!");
    }

    void displayprimeseries(int limitprime)
    {
        int x, y, flg;
        System.out.println("\nAll the Prime numbers within 1 and " + limitprime + " are:");

        for (x = 1; x <= limitprime; x++)
        {

            if (x == 1 || x == 0)
                continue;

            flg = 1;
            for (y = 2; y <= x / 2; ++y)
            {
                if (x % y == 0)
                {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }

}

class N
{
    void evencheck(int e)
    {
        if (e % 2 == 0)
        {
            System.out.println("Even number.");
        } else
        {
            System.out.println("Odd number.");
        }
    }
}

class O extends N
{
    O()
    {
        super();
    }

    O(int e)
    {
        super.evencheck(e);
    }
}

class P
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Studentname: ");
        String Studentname = sc.next();
        System.out.print("Enter coursename: ");
        String coursename = sc.next();

        L l = new L(Studentname);
        l.displayIt(coursename);

        M m = new M();
        m.choice();
        if (args.length > 0)
        {
            int limitprime = Integer.parseInt(args[0]);
            m.displayprimeseries(limitprime);

        }

        N n = new N();
        System.out.print("\nEnter to check whether a number is Even or Odd: ");
        int e = sc.nextInt();
        n.evencheck(e);

        System.out.print("Enter the another number you want for the superclass(Subclass O): ");
        int anothernumber = sc.nextInt();
        O o = new O();
        o.evencheck(anothernumber);

        sc.close();
    }

}




