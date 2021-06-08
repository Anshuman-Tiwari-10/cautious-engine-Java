import java.util.Random;
import java.util.Scanner;

public class randomArray{
    
    public static void main(String args[]){

        System.out.println("Enter the sizeof random array-->");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){

            Random rand = new Random();
            arr[i] = rand.nextInt(50);

        }

        for(int i = 0; i<size; i++){

            System.out.println(i +" : "+arr[i]);

        }

    }
}
