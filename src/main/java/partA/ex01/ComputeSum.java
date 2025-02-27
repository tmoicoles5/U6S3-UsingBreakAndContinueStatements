package partA.ex01;

import java.util.Scanner;

public class ComputeSum {

    public static String computeSum() {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        int sum = 0 , count = 0;
        System.out.println("Enter up to 10 numbers (enter 0 to exit):\n");
        while (count < 10) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }





        response+= "Sum of numbers entered: " +sum;
        scanner.close();
        return response;
    }

    public static void main(String[] args) {
        String sum = computeSum();
        System.out.print(sum);
    }




    }

