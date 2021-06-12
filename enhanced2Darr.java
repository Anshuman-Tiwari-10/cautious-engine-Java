public class enhanced2Darr {
    public static void main(String args[]) {

        // int[][] arr = new int[3][3];

        int arr[][] = {
            {3,4,5}, 
            {6,8,10}, 
            {9,11,12}
        };

        for (int i[] : arr) {
            for (int j : i) {

                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}
