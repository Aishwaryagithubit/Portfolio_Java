public class RangeSearch {
    public static void main(String[] args) {
     int [] nums = {19,11,-7,30,15,27};
     int target = 4;
        System.out.println(rangecheck(nums, target, 1,5));
    }

    // start to end range
    static int rangecheck(int [] arr, int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i<= end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
        return -1;
    }
}

