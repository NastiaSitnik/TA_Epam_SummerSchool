import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FirstTask {

    public static void fillArray(ArrayList<Integer> array, int intervalStart, int intervalEnds) {

        for (int i = intervalStart; i <= intervalEnds; i++) {
            array.add(i);
        }
    }

    public static void calculateSum(ArrayList<Integer> array) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                    evenSum += array.get(i);
            }else{
                oddSum += array.get(i);
            }
        }
        System.out.println("Odd suma = " + oddSum + " Even suma = " + evenSum);
    }

    public static void findFibonacci( int n){
        ArrayList<Integer> fibonacciOdd = new ArrayList<>();
        ArrayList<Integer> fibonacciEven = new ArrayList<>();
        int a = 0,b = 1;
        for(int i = 0; i < n-2; i++) {
            int c = a + b;
            a = b;
            b = c;
            if(c % 2 == 0) {
                fibonacciOdd.add(c);
            }else{
                fibonacciEven.add(c);
            }
        }
        for(int i=0;i<fibonacciOdd.size();i++) {
            System.out.println("Odd = " +fibonacciOdd.get(i));
        }
        for(int i=0;i<fibonacciEven.size();i++) {
            System.out.println("Even = " +fibonacciEven.get(i));
        }
        System.out.println("Max Odd Fibonacci =" + Collections.max(fibonacciOdd));
        System.out.println("Max Even Fibonacci = " + Collections.max(fibonacciEven));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of interval");
        int intervalStart = scanner.nextInt();
        System.out.println("Enter end of interval");
        int intervalEnds = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        fillArray(array,intervalStart,intervalEnds);
        calculateSum(array);
        System.out.println("\n Fibonacci Task : ");
        findFibonacci(15);
    }

}
