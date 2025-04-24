package LogicalCode;

public class fibonacciSeries {
    public static void main(String[] args) {
        int num =20;
         int number1=0;
         int number2=1;

        for(int i=1;i<=num;i++){

            System.out.println(number1);
          int  result=number1+number2;
            number1=number2;
            number2=result;




        }

    }
}
