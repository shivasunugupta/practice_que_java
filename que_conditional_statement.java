import java.util.Scanner;

public class que_conditional_statement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


          //que 1take input for marks of 3 sub from user , to pass score at least 33% in each sub and 40 in total

//        int sub1,sub2,sub3;
//        float per1,per2,per3;
//
//        System.out.println("enter the total marks");
//        int totmarks = sc.nextInt();
//
//        System.out.println("enter the marks in 3 subject");
//
//        System.out.println("in sub1");
//        sub1 = sc.nextInt();
//        per1= ((float) sub1 /totmarks)*100;
//        System.out.println(per1);
//
//        System.out.println("in sub2");
//        sub2 = sc.nextInt();
//        per2= ((float) sub2/totmarks)*100;
//        System.out.println(per2);
//
//        System.out.println("in sub3");
//        sub3 = sc.nextInt();
//        per3= ((float)sub3/totmarks)*100;
//        System.out.println(per3);
//
//        int total_marks = sub1+sub2+sub3;
//        int total_poss_marks = (totmarks*3);
//
//        float totper = ((float)total_marks/total_poss_marks)*100;
//
//        if(per1>=33 && per2>=33 && per3>=33 && totper>=40)
//        {
//            System.out.println("YOU ARE PASSED !!!");
//        }
//        else
//        {
//            System.out.println("YOU ARE FAILED !!!");
//        }
//
          //que 2 income tax
//        System.out.println("Enter your income ");
//        int income = sc.nextInt();
//
//        if (income<250000)
//        {
//            System.out.println("no tax");
//        }
//
//        else if (income>=250000 && income<500000)
//        {
//            System.out.println("you have to pay 5% tax");
//        }
//
//        else if( income>=500000 && income <1000000)
//        {
//            System.out.println("you have to pay 10% tax");
//        }
//
//        else
//        {
//            System.out.println("you have to pay 20%  ");
//        }

//        //que 3 print the pattern
//        System.out.println("enter the value of n");
//        int n = sc.nextInt();
//
//        for (int i=1; i<=n; i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

          //que4 fum of first n even num
//        System.out.println("enter the value of n");
//        int n= sc.nextInt();
//        int i,sum=0;
//        for (i=0;i<n;i++)
//        {
//            sum=sum+(2*i);
//        }
//        System.out.println("sum of the numbers is :");
//        System.out.println(sum);

//        //que 5 write a multiplication table of any number
//        System.out.println("enter the number ");
//        int n=sc.nextInt();
//        for (int i=1;i<10;i++)
//        {
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }

          //que 6 factorial if a no
//        System.out.println("enter the number ");
//        int n = sc.nextInt();
//        int i,fact=1;
//        for(i=1;i<=n;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.printf("Factorial of %d is: %d",n,fact);

        //que 7 no is prime or not
        System.out.println("no of rows");
        int n = sc .nextInt();

        boolean isPrime = true;
        for(int i=2; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }


        if(isPrime)
        {
            if(n == 1)
            {
                System.out.println("This is neither prime not composite");
            }
            else
            {
                System.out.println("This is a prime number");
            }
        }
        else
        {
            System.out.println("This is not a prime number");
        }






    }
}









