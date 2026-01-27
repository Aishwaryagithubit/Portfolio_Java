import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 5},
                {12, 24, 19, 9},
                {23, 56, 47, 66},
                {12, 1}
        };

        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // Fix: use arr[row].length
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}





