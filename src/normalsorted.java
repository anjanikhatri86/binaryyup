public class normalsorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        int target = 8;
        int an[] = searchingelement(matrix, target);
        for (int i = 0; i < an.length; i++) {


            System.out.println(an[i] + " ");
        }

    }

    static int[] binarysearch(int[][] matrix, int row, int cstr, int cend, int target) {

        while (cstr <= cend) {
            int mid = cstr + (cend - cstr) / 2;
            if (target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if (target > matrix[row][mid]) {
                cstr = mid + 1;
            } else {
                cend = mid - 1;
            }

        }
        return new int[]{-1, -1};
    }

    static int[] searchingelement(int[][] matrix, int target)
    {
        int rowl = matrix.length;
        int coll = matrix[0].length, rstart = 0, rend = rowl - 1;

        int rstr = 0;
        int cmid = coll / 2;
        if (rowl == 1) {
            return binarysearch(matrix, 0, 0, coll - 1, target);
        }
        while (rstr < rend - 1) {
            int mid = rstr + (rend - rstr) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstr = mid;
            } else {
                rend = mid;
            }
        }
        //now two rows remaining
        if (matrix[rstr][cmid] == target) {
            return new int[]{rstr, cmid};
        }
        if (matrix[rstr + 1][cmid] == target) {
            return new int[]{rstr + 1, cmid};
        }
        if (target<=matrix[rstr][cmid - 1] )
        {
            return binarysearch(matrix, rstr, 0, cmid - 1, target);
        }
        if (target<=matrix[rstr + 1][cmid - 1])
        {
            return binarysearch(matrix, rstr + 1, 0, cmid - 1, target);
        }
        if (target>=matrix[rstr][cmid + 1] )
        {
            return binarysearch(matrix, rstr, cmid + 1, coll - 1, target);
        }

        else
        {
            return binarysearch(matrix, rstr + 1, cmid + 1, coll - 1, target);
        }

    }

}






