import java.util.Scanner;

public class que_array
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);        //que 1 sum of all the elements in an araay
//        float [] marks={34.5f,67.2f,74.2f,89.6f,54.1f};
//        float sum=0;
//        for (float elements:marks)
//        {
//            sum=sum+elements;
//        }
//        System.out.printf("the value of the sum is "+ sum);

        //que 2 linear search
//        float [] marks={34.5f,67.2f,74.2f,89.6f,54.1f};
//        System.out.println("enter the value of element to be find ");
//        float num=sc.nextFloat();
//        boolean isinarray =false;  //already taken as false
//        for (float element:marks)
//        {
//            if(num==element)
//            {
//                isinarray=true;
//                break;
//            }
//        }
//
//        if (isinarray)
//        {
//            System.out.println("the value is present in the array" );
//        }
//
//        else
//        {
//            System.out.println("not present in the array");
//        }

        //que 3 average of all the elements
//        float [] marks={34.5f,67.2f,74.2f,89.6f,54.1f};
//        float sum=0;
//        for (float elements:marks)
//        {
//            sum=sum+elements;
//        }
//        System.out.printf("the value of average marks is "+ sum/marks.length);

        //que 4 sum of 2 2X3 matrices
//        int [][] a = { {1,3,4} , {7,4,7} };
//        int [][] b = { {3,6,7} , {9,2,1} };
//        int [][] sum={ {0,0,0} , {0,0,0} };
//
//        for ( int i=0;i< a.length;i++)
//        {
//            for ( int j=0;j<a[i].length;j++)
//            {
//                System.out.format("setting value for i= %d and j=%d \n",i,j);
//                sum [i][j]= a[i][j] + b[i][j];
//            }
//        }

        //que 5 printing a 2d array
//        for ( int i=0;i< a.length;i++)
//        {
//            for ( int j=0;j<a[i].length;j++)
//            {
//                System.out.print(sum[i][j] + " ");
//                sum [i][j]= a[i][j] + b[i][j];
//            }
//            System.out.println("");
//        }

        //que 6 reversing an array\
//        int [] arr ={34,56,32,12,7,57,98,81,20};
//        int l=arr.length;
//        int temp;
//        int n=Math.floorDiv(l,2);
//
//        for ( int i=0;i<n;i++)
//        {
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for(int element:arr)
//        {
//            System.out.print(element + " ");
//        }

        //IMP QUE 7 spiral array

//        Algorithm: (We are given a 2D matrix of n X m ).
//        1. Initialize variables:
//           a. row_start - initialized with 0.
//           b. row_end - initialized with n-1.
//           c. column_start - initialized with 0.
//           d. column_end - initialized with m-1.
//        2. First of all, we will traverse in the row row_start from column_start
//           to column_end and we will increase the row_start with 1 as we have
//           traversed the starting row.
//        3. Then we will traverse in the column column_end from row_start to
//           row_end and decrease the column_end by 1.
//        4. Then we will traverse in the row row_end from column_end to
//           column_start and decrease the row_end by 1.
//        5. Then we will traverse in the column column_start from row_end to
//           row_start and increase the column_start by 1.
//        6. We will do the above steps from 2 to 5 until row_start <= row_end
//           and column_start <= column_end.

        System.out.println("enter the number of rows");
        int n = sc.nextInt();   //rows

        System.out.println("enter the number of columns ");
        int m = sc.nextInt();   //columns


        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;


        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            //1
            for(int col=colStart; col<=colEnd; col++)
            {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++)
            {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;


            //3
            for(int col=colEnd; col>=colStart; col--)
            {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd; row>=rowStart; row--)
            {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();

        }


    }
}

