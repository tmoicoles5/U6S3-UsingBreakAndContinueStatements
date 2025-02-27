package partB.ex01;

import java.util.Scanner;

public class LoopWithBreak {
    public static String loopWithBreak() {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        double s = 0.0;
        while (true){
            System.out.println("Enter a number: ");
            double n = scanner.nextDouble();
            if (n<0){
                break;
            }
            s+=n;
        }
        System.out.println("Sum =  " + s);
        scanner.close();



            




        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.print(loopOutput);
    }

}
