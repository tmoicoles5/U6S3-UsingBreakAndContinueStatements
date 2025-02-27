package partB.ex03;

import java.util.Scanner;

public class DisplayMultiples {
    public static String displayWithMultiples() {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }

        }
        //





        return response;
    }

    public static void main(String[] args) {
        String displayOutput = displayWithMultiples();
        System.out.print(displayOutput);
    }
}
