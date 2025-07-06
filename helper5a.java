public class helper5a
{
    static int partition(int[] num, int i, int j)
    {
        int pivot = num[(i+j)/2];
        while(i < j)
        {
            while(num[i] < pivot)
            {
                i++;
            }
            while(pivot < num[j])
            {
                j--;
            }
            if(i <= j)
            {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    static void quicksort(int[] num, int i, int j)
    {
        int pivot = partition(num, i, j);

        if(i < pivot-1)
        {
            quicksort(num, i, pivot-1);
        }
        if(pivot< j)
        {
            quicksort(num, pivot, j);
        }
    }

    public static void main (String[] args)
    {
        int[] num = {27, 23, 11, 7, 9, 17, 6};

        System.out.println("Unsorted array:");
        for(int i: num)
        {
            System.out.print(i + " ");
        }
        quicksort(num, 0, num.length-1);
        System.out.println("\nSorted array:");
        for(int i: num)
        {
            System.out.print(i + " ");
        }
    }
}