package PACKAGE_NAME;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
    
        //input to print Fibonacci series upto how many numbers
         System.out.println("Enter number upto which Fibonacci series to print: ");
         int number = new Scanner(System.in).nextInt();
       
         System.out.println("Fibonacci series upto " + number +" numbers : ");
         //printing Fibonacci series upto number
         for(int i=1; i<=number; i++){
             System.out.print(fibonacciRecursion(i) +" ");
         }
        }
    
        public static int fibonacciCal(int number){
            if(number == 1 || number == 2){
                return 1;
            }
            int fibo1=1, fibo2=1, fibonacci=1;
            for(int i= 3; i<= number; i++){
               
                //Fibonacci number is sum of previous two Fibonacci number
                fibonacci = fibo1 + fibo2;             
                fibo1 = fibo2;
                fibo2 = fibonacci;
              
            }
            return fibonacci; //Fibonacci number
          
        }   


        public static int fibonacciRecursion(int number){
            if(number == 1 || number == 2){
                return 1;
            }

            return fibonacciRecursion(number-1) + fibonacciRecursion(number -2); //tail recursion
        }

        

}


