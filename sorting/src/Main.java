import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        bubble_sort(new int[]{4,3,6,2,8,1});
        //System.out.println(Arrays.toString(Arrays.copyOfRange(new int[]{4,3,6,2,8,1},1,6)));
    }

    public static void selection_sort(int[] a)
    {
        for(int i =0;i<a.length-1;i++)
        {

            int min= smallest(Arrays.copyOfRange(a,i,a.length+1));
            a= swap(a,i,min+i);
        }
        System.out.println(Arrays.toString(a));
    }
    public static int[] swap(int[] a,int b,int c)
    {
        int temp = a[b];
        a[b]=a[c];
        a[c]=temp;
        return a;
    }

    public static int smallest(int[] a)
    {
        int smallest = 1000;
        int index=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<smallest)
            {
                smallest=a[i];
                index=i;
            }
        }
        return index;
    }

    public static void bubble_sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    a=swap(a,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    
}
