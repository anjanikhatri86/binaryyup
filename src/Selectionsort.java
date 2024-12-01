import java.util.Arrays;

public class Selectionsort
{
    public static void main(String[] args) {
        int[] ar ={5,4,9,2,1};

        for (int i = 0; i < ar.length; i++)
        {
            int arlast = ar.length - 1 - i;
            int inmaxelement=maxindex(ar,0,arlast);

            swap(ar,inmaxelement,arlast);
        }
        System.out.println(Arrays.toString(ar));
    }
    static int maxindex(int[] arr,int start,int end)
    {
        int max=start;
        for (int i = start; i <= end; i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] ar,int maxindex,int lastin)
    {
        int temp=ar[maxindex];
        ar[maxindex]=ar[lastin];
        ar[lastin]=temp;

    }
}
