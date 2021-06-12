import java.util.Scanner;

class demo1 {

    public static void main(String args[]) {

        // -----------Fibonacci Sequence-----------------------

        long x = 1, z;
        long y = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n>=2){

            System.out.print(x + "\t" + y + "\t");

            for (int i = 1; i <= n-2; i++) {
                System.out.print(x + y + "\t");
                z = x + y;
                x = y;
                y = z;

            }
        }

        else if(n==1){
            System.out.print("1");
        }
        else if(n==2){
            System.out.print("1  1  ");
        }
        else{
            System.out.print("Invalid");
        }
        
        // ----------------------xxxx---------------------------

        // for(int i=1; i<=5; i++){

        // for(int j = 1; j<=i; j++){

        // System.out.print(i+" ");

        // }

        // System.out.print('\n');

        // }

        // -----------------------xxxx--------------------------

        // printing pattern-------------->

        // for(int i=0; i<=5; i++){

        // for(int j = 0; j <=i; j++){

        // System.out.print((i+j+1)%2);

        // }
        // System.out.print('\n');

        // }

        // -----------------------xxxx--------------------------

        // first line printed------->
        // java.lang.System.out.println("Hello World, in Java";

        // -------------------------xxxx------------------------

        // second line printed with binary to character conversion
        // int i = 0B1001001;
        // System.out.println((char) i);

        // ------------------------xxxx-------------------------

        // Printing some patterns -----------> //
        // for(int j=0; j<5; j++){

        // for(int k = 0; k<5; k++){

        // System.out.print(" :-) ");

        // }
        // System.out.print("\n");

        // }

    }

}