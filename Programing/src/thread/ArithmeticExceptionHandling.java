package thread;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int divisior=-2;
        int number=-56;
        try{
            int division=number/divisior;
            System.out.println("division is " +division);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
