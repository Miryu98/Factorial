import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int factorial = 1;

        for(int i = 1; i <= N; i++) {

            factorial *= i;
        }
        
        System.out.println(factorial);
   }
}

/*
Create a program that takes a number from input and output the factorial of that number.
*/
