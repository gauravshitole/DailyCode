package factory;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        FactoryCar factoryCar=new FactoryCar();
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Your Fev Car");
        String  CName=scanner.nextLine();

        Car car= factoryCar.getCar(CName);
        car.printDetail();
    }
}
