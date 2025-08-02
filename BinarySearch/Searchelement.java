public class Searchelement {
    public static void main(String[] args) {
       int[] arr = {2,4,6,7,9,22,34};
       int target = 9;
       int ans = BinSearch(arr,target);
        System.out.println(ans);
    }
    static int BinSearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            //find middle element
            int mid = start + (end-start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;

            }
                
            else{
                return mid;
            }
        }
        return -1;
    }
}

