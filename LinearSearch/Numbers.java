public class Numbers {
    public static void main(String[] args) {
       int [] nums = {1,32,57,44,67,111,-20};
       int target = 111;
       int ans = Findnum(nums,target);
        System.out.println(ans);
    }

    //return index 1 otherwise -1
    
    static int Findnum(int[]arr , int target){
        if(arr.length==0){
            return -1;
        }

        for(int i = 0; i<arr.length ; i++){
            //check element
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
