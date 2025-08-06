public class MultiD {
    public static void main(String[] args) {
        // rows and columns
        int [][] marks = new int [3][3];
        marks [0][0] = 98;
        marks [0][1] = 80;
        marks [0][2] = 93;
        marks [1][0] = 90;
        marks [1][1] = 95;
        marks [1][2] = 88;
        marks [2][0] = 89;
        marks [2][1] = 87;
        marks [2][2] = 93;

        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks[i].length ; j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            // after one line
            System.out.println("\n");
        }

    }
}
