package Oct;

import java.util.Scanner;

public class FunctionProgram {
    static void add(int a, int b){
        int result = a+b;
        System.out.println("addition" + result);
        sub(4,3);
    }
    static void sub(int a, int b){
        int result = a-b;
        System.out.println("subtraction" + result);
        mul(4,5);
    }
    static void mul(int a, int b){
       int result = a*b;
        System.out.println("multiplication" + result);
    }
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = userInput.nextInt();
        System.out.println("Enter second number");
        int secondNumber = userInput.nextInt();

        add(firstNumber,secondNumber);



    }
}
