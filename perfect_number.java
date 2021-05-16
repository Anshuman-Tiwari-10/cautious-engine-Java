import java.util.Scanner;

public class perfect_number {

    public static void main(String args[]){
        System.out.println("Enter a number to check if its perfect or not--->");
        Scanner sc = new Scanner(System.in);
        int check_num = sc.nextInt();
        sc.close();

        int sum = 1;
        for(int i = 2; i<= check_num/2; i++){
            if(check_num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == check_num){
            System.out.println(check_num +" is a perfect number");
        }
        else{
            System.out.println(check_num +" is not a perfect number");
        }
    }

}

