public class floor {
    public static void main(String[] args)
    {
    int[] ar = {1, 2, 32, 45, 55, 65};
    int tar = 63;
    int an=binfindelementindex( ar, tar);
    System.out.println(an);
}
    static int binfindelementindex(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        //int mid=start+(end-start)/2;// we can not do it because of scoping as values of start and mid is getting updated in bracket so it can not be assessed outside so mid will continue to
        //            // have the same value as it was having earlier thus no updation in it*
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                return arr[mid];
            }
        }
        return arr[(end % arr.length)];
    }
}


