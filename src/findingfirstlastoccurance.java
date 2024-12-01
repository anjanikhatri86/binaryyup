import java.util.Arrays;

public class findingfirstlastoccurance
{
    public static void main(String[] args)
    {
        int[] ans={-1,-1};
        int[] ar={4,5,6,7,7,7,8,9,10};
        int target=7;
       int startind= binadvancesear(ar,  target, true);
        int endind=binadvancesear( ar,  target,  false);
       ans[0]=startind;
       ans[1]=endind;
       for(int i=0;i<ans.length;i++)
          // System.out.print(ans[i] +",");
        System.out.println(Arrays.toString(ans));
    }

    static int binadvancesear(int[] arr, int target, boolean star)
    {
        int start = 0,ans=-1;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
            {
                end = mid - 1;
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                ans=mid;
                if (star)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }

            }

        }
        return ans;
    }
}
