package partB.ex02;



public class LoopWithContinue {
    public static String loopWithContinue() {
        String response = "";

       // Using a for loop & continue statement to execute numbers.
        int i = 0;

        for (i = 0; i < 10 ; i++){
            if (i > 4 && i < 9){
                continue;
            }
            System.out.println(i);
        }




        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithContinue();
        System.out.print(loopOutput);
    }

}
