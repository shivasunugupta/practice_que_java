import java.util.Scanner;

public class que_patterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();

        //que 1 solid rec.
//        System.out.println("no of rows");
//        int n = sc .nextInt();
//
//        System.out.println("no of columns");
//        int m = sc.nextInt();
//
//        for (int i=1; i<=n; i++)
//        {
//            for (int j = 1; j <= m; j++)
//            {
//                System.out.print(" * ");
//            }
//            System.out.println();
//
//        }

        //que 2 hollow rect
//        System.out.println("no of rows");
//        int n = sc .nextInt();
//
//        System.out.println("no of columns");
//        int m = sc.nextInt();
//
//        for (int i=1; i<=n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == n || j == n) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }

        //que 3 half pyramid
//        System.out.println("no of rows");
//        int n = sc .nextInt();

//         System.out.println("no of columns");
//         int m = sc.nextInt();

//        for (int i=1; i<=n; i++)
//        {
//            for (int j = 1; j <=i ; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        //que 4 inverted half pyramid
//        System.out.println("no of rows");
//        int n = sc .nextInt();
//
//        //System.out.println("no of columns");
//        //int m = sc.nextInt();
//
//        for (int i=n; i>=1; i--)
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(" * ");
//
//            }
//            System.out.println();
//        }

        //que5
//        for (int i=1; i<=n; i++)
//        {
//            for (int j = 1; j <= n-i; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //que 6 number pattern
//        System.out.println("no of rows");
//        int n = sc .nextInt();
//
//        for (int i=1;i<=n;i++)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //que 7 inverted pyramid with no

//        System.out.println("no of rows");
//        int n = sc .nextInt();
//
//        for (int i=1;i<=n;i++)
//        {
//            for (int j=1;j<=n+1-i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        //que 8 floyds triangle

//        int number=1;
//        for (int i =1;i<=n;i++)
//        {
//           for (int j=1;j<=i;j++)
//           {
//               System.out.print(" "+number+" ");
//               number++;
//           }
//            System.out.println();
//        }

        // que 9  0-1 triangle
//        System.out.println("no of rows");
//        int n = sc .nextInt();
//
//        //when sum  i+j = even -> print 1
//        //when sum  i+j = odd-> print 0
//
//        for (int i =1;i<=n;i++) {
//            for(int j=1;j<=i;j++) {
//                int sum =i+j;
//                if(sum % 2==0) {
//                    System.out.print(" 1 ");
//                }
//                else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
//        }

        //solid complete triangle
//        for(int i =0;i <=n;i++){
//            for(int j = 0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//
//            for (int j =0;j<2*i +1;j++){
//                System.out.print("*");
//            }
////            for(int j = 0;j<=n-i-1;j++){
////                System.out.print(" ");
////            }
//            System.out.println();
//        }


        //que 10 butterfly pattern
//        *    *
//        **  **
//        ******
//        ******
//        **  **
//        *    *
        //spaces = 2*(n-1)

//        System.out.println("enter the value of n");
//        int n = sc.nextInt();
//         //upper  half
//        for (int i=1;i<=n;i++)
//        {
//            for (int j =1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            //spaces
//            int spaces =2*(n-i);
//            for (int j=1;j<=spaces;j++)
//            {
//                System.out.print(" ");
//            }
//
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//
////        //lower half
//        for (int i=n;i>=1;i--)
//        {
//            for (int j =1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            //spaces
//            int spaces =2*(n-i);
//            for (int j=1;j<=spaces;j++)
//            {
//                System.out.print(" ");
//            }
//
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println( );
//        }

        //que 11 solid rhombus
        //spaces n-i
//        System.out.println("enter the value of n");
//        int n = sc.nextInt();
//        for (int i =1;i<=n;i++)
//        {
//            for (int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //que 12
//        hollow rohmbus
//        System.out.println("enter the value of n");
//        int n = sc.nextInt();
//        for (int i =1;i<=n;i++)
//        {
//            for (int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n;j++)
//            {
//                if (i==1 || j==1 || i==n || j==n)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

        //que 13 number space pyramid
//              1
//             2 2
//            3 3 3
//           4 4 4 4
//          5 5 5 5 5
//
//        System.out.println("enter the value of n");
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++)
//        {
//            for (int j =1;j<=n-i;j++)
//            {
//                System.out.print(" "); //spaces
//            }
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(i+" "); //num --> print row number row no of times
//            }
//            System.out.println();
//        }

        // *
//        **
//        ***
//        ****
//        ***
//        **
//        *

//        for(int i = 1; i <= (2*n)-1;i++){
//            int j = i;
//            if(i > n) {
//                j = (2*n)- i;}
//            for(int k =1;k<=j;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //que 13 palindrome pattern pyramid
//        System.out.println("enter the value of n");
//        int n = sc.nextInt();
//
//        for(int i=1;i<=n ;i++)
//        {
//            //spaces
//            for(int j =1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
////            first half
//            for(int j =i;j>=1;j--)
//            {
//                System.out.print(j);
//            }
////            sec half
//            for (int j=1;j<=i;j++)    //if the middle "1" has to be printed only once the start from "j=2"
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//       }


        //pascal (11)  wala triangle
//        int val =1;
//         for (int i=1; i<=n; i++){
//             for (int j = 1; j <= n-i+1; j++){
//                 System.out.print(" ");
//             }
//             String str = String.valueOf(val);
//             for(int k = 0;k<str.length();k++){
//                 System.out.print(str.charAt(k)+ " ");
//             }
//             val = val*11;
//             System.out.println();
//         }




        //que 14 diamond pattern
        //stars = 2*i -1
//        //upper half
//        for(int i =1;i<=n;i++)
//        {
//            //spaces
//            for (int j =1;j<=n-i;j++) {
//                System.out.print(" ");
//            }
//
//            //stars
//            for (int j =1;j<=2*i-1;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //lower half
//        for(int i =n;i>=1;i--)
//        {
//            //spaces
//            for (int j =1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//
//            //stars
//            for (int j =1;j<=2*i-1;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }



//                for(int i=1;i<=n;i++){
//                    if(hasUniqueDigit(i))
//                        System.out.println(i);
//                }
//                return;
//
//            }
//            private static boolean hasUniqueDigit(int n){
//                boolean[] arr = new boolean[10];
//                while(n!=0){
//                    int digit = n%10;
//                    if(arr[digit])return false;
//                    arr[digit] = true;
//                    n/=10;
//                }



        // palindrome triangle
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int j=i-1;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }



//        1      1
//        12    21
//        123  321
//        12344321
//        int space = 2*(n-1) ;
//        for (int i = 1;i<=n;i++){
//            //number
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            //space
//            for(int j = 1;j<=space;j++){
//                System.out.print(" ");
//            }
//            //number
//            for(int j = i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//            space -=2;
//        }


        //ABC triangle
//        for(int i =0;i<n;i++){
//            for (char ch = 'A' ; ch<='A' +i;ch++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }


        //ABC inverted triangle
//        for(int i =0;i<n;i++){
//            for (char ch = 'A' ; ch<='A' + (n-i-1);ch++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }


        //AA triangle
//        for(int i =0;i<n;i++){
//            char ch =(char) ('A' + i);
//            for (int j =0 ; j<=i;j++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

        //palindrome ABC triangle
//        for (int i =0;i<n;i++){
//            for (int j = 0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            int breakpoint = (2* i +1)/2;
//            char ch ='A';
//            for(int j =1;j<=(2*i);j++){
//                System.out.print(ch);
//                if(j<= breakpoint){
//                    ch++;
//                }else {
//                    ch--;
//                }
//            }
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        //diamond in rectangle
//        int iniSpace = 0;
//        for(int i =0; i<= n ;i++){
//            // stars
//            for (int j = 1;j<= n-i;j++){
//                System.out.print("*");
//            }
//            //spaces
//            for(int  j = 0; j <iniSpace;j++){
//                System.out.print(" ");
//            }
//            // stars
//            for (int j = 1;j<= n-i;j++){
//                System.out.print("*");
//            }
//            iniSpace +=2;
//            System.out.println();
//        }
//        iniSpace = 8;
//        for(int i =1; i<= n ;i++){
//            // stars
//            for (int j = 1;j<= i;j++){
//                System.out.print("*");
//            }
//            //spaces
//            for(int  j = 0; j <iniSpace;j++){
//                System.out.print(" ");
//            }
//            // stars
//            for (int j = 1;j<= i;j++){
//                System.out.print("*");
//            }
//            iniSpace -=2;
//            System.out.println();
//        }

        //number ke andar number square
//        for(int i =0;i<2*n-1;i++){
//            for(int j =0;j<2*n-1;j++){
//                int top =i;
//                int left =j;
//                int right =(2*n-2) -j;
//                int down =(2*n-2) -i;
//                System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right))) ;
//            }
//            System.out.println();
//        }



    }
}
