import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] ar ={5,6,4,3,3,2,4,4,5,4,5,4,3,3,2,85,78,78,5785};
        insertionsorting(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void swap(int[] ar,int maxindex,int lastin)
    {
        int temp=ar[maxindex];
        ar[maxindex]=ar[lastin];
        ar[lastin]=temp;

    }
    static void insertionsorting(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)

        {
            for (int j = i+1; j >0 ; j--)
            {
                if (arr[j]<arr[j-1])
                {
                    swap(arr,j-1,j);
                }
                else {
                    break;
                }


            }

        }
    }

}
