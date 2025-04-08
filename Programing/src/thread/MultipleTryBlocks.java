package thread;

import java.util.Scanner;

public class MultipleTryBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter number 1 :-");
            String numberSting = scanner.nextLine();
            int number1;
            try {
                number1 = Integer.parseInt(numberSting);

            } catch (NumberFormatException e) {
                number1 = 0;
            }
            System.out.println("Please Enter number 2 :-");
            String number2String = scanner.nextLine();
            int number2;
            try {
                number2 = Integer.parseInt(number2String);
                if (number2 == 0) {
                    throw new IllegalArgumentException("Invalid input user enter number");
                }
            } catch (NumberFormatException e) {
                number2 = 1;
            }
int division =number1/number2;
            System.out.println(division);
        }catch (ArithmeticException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block");
        }
    }
}
