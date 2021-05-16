import java.util.Scanner;

public class isArmstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum = 0, temp = num;
        while(num>0){

            sum += Math.pow(num%10, 3);
            num /= 10;

        }
        if(sum==temp)
            System.out.println(temp +" is an Armstrong number");
        else{
            System.out.println(temp +" is not an Armstrong Number");
        }
    }
}
