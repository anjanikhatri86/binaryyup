public class rcsortedmat {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 55,56}};
        int target = 43;
        int an[] = searchtar(arr, target);
        for (int i = 0; i < an.length; i++) {


            System.out.println(an[i] + " ");
        }
    }

    static int[] searchtar(int[][] arr, int target)//finding element in 2d array by decreasing search space
    {
        int row = 0;

        int col= arr[0].length - 1;;


          while (col >= 0 && row < arr.length)
        {





            if (target == arr[row][col])
            {

                return new int[]{row,col};
            }
            else if (target < arr[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return new int[]{-1,-1};
    }

}