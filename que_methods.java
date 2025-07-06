public class que_methods
{
    //que 1
    static void multi(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d \n",n,i,n*i);
        }
    }

    //que 2
    static int sum(int n)
    {
        if (n==1)
        {
            return 1;
        }
        return n + sum(n-1);
    }

    //que 3 fibonacci series
    static int fib(int n)
    {
//        if (n==1)
//        {
//            return 0;
//        }
//        else if (n == 2)
//        {
//            return 1;
//        }
//        another method

        if(n==1 || n==2)
        {
            return n-1;
        }

        else
        {
            return fib(n-1)+fib(n-2);
        }
    }


    public static void main(String[] args)
    {
        multi(6);

        int c= sum(7);
        System.out.println(c);

        int result =fib(8);
        System.out.println(result);

    }
}
