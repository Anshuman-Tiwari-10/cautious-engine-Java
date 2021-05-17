import java.util.Scanner;


public class arrays {
    public static void main(String args[]){
        
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array:");

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Array elements are as follows:--");

        for(int i = 0; i<size; i++){
            
            System.out.println(i+1 +":"+ arr[i]);
        }

        // Alternate method using enhanced for loop

        // for(int i : arr){
        //     System.out.println(i);
        // }

    }    
}
