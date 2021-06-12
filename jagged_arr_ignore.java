import java.util.Scanner;

public class jagged_arr_ignore {
    public static void main(String args[]){

        System.out.println("Enter the number of rows : ");

        Scanner sc = new Scanner(System.in);

        int row_count = sc.nextInt();
        String rows[] = new String[row_count];

        for(int i=0; i<row_count; i++) {
            rows[i] = sc.next();
        }
        
        sc.close();

        // char[] rows;
        for(String line : rows) {
            
            System.out.println(line);

        }
        


    }
}
