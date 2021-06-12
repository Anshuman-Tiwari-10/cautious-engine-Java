public class arr3D {

    public static void main(String args[]) {

        int arr3d [][][] = new int[3][3][3];

        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    arr3d[i][j][k] = i+2*j+3*k;
                }
                System.out.println("");
            }
            System.out.println("");
        }

        for(int i[][] : arr3d){
            for(int j[] : i) {
                for(int k : j){
                    System.out.print(k+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }
    
}
