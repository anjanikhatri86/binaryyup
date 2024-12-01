import java.util.Arrays;

public class Cyclicsort{
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1,6,8,7,9,10};
        cyclicsorting(arr);
        System.out.println(Arrays.toString(arr));
    }

        static void swap(int[] ar,int maxindex,int lastin)
        {
            int temp=ar[maxindex];
            ar[maxindex]=ar[lastin];
            ar[lastin]=temp;

        }

        static void cyclicsorting(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int desired=arr[i]-1;
                if (arr[i] != arr[desired])
                {
                    swap(arr,i,desired);
                }
                else
                {
                    i++;
                }
            }
        }

}

