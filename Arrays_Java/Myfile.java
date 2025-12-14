public class Myfile {

    public static void main(String[] args) {
        int [] a ={3,5,6,7,7};
        sumOfArray(a);

        int [] b ={7,8,9,4,4};
        sumOfArray(b);
    }

    public static void sumOfArray(int[]arr){
        int j = 0;
        for(int i : arr){
            j += i;
        }
        System.out.println(j);
    }
}
