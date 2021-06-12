import java.util.Scanner;

public class Prime {

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        sc.close();

        boolean check = false; 

        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                System.out.println(num +" You entered a Non-Prime number");
                check = true;
                break;
            }
        
            }
        if(check==false){
            System.out.println(num +" You entered a Prime Number");
        }

        }
    }
