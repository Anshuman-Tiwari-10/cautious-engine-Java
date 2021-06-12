import java.util.Scanner;

public class isPalindrome {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        int candidate = 0, temp = input;
        while(input>0){
            candidate = candidate*10 + (input%10);
            input = input/10;
        }
        if(candidate == temp){
            System.out.println(temp +" is palindrome!!");
        }
        else{
            System.out.println(temp +" is not palindrome!!");
        }

    }
}
